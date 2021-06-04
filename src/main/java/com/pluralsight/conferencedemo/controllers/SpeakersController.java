package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.model.Session;
import com.pluralsight.conferencedemo.model.Speaker;
import com.pluralsight.conferencedemo.repositories.SpeakersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakersRepository speakersRepository;

    //=========List===========
    @GetMapping
    public List<Speaker> list() {
        return speakersRepository.findAll();
    }

    //==========get===========
    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakersRepository.getOne(id);
    }

    //==========create===========
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Speaker create(@RequestBody final Speaker speaker) {
        return speakersRepository.saveAndFlush(speaker);
    }

    //==========update===========
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        Speaker existingSpeaker = speakersRepository.getOne(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
        return speakersRepository.saveAndFlush(existingSpeaker);
    }
}
