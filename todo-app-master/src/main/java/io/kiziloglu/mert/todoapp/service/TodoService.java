package io.kiziloglu.mert.todoapp.service;

import io.kiziloglu.mert.todoapp.converter.TodoListConverter;
import io.kiziloglu.mert.todoapp.dto.TodoListDto;
import io.kiziloglu.mert.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoService {

    private TodoListConverter todoListConverter;
    private TodoRepository todoRepository;

    @Inject
    public TodoService(TodoListConverter todoListConverter,
                       TodoRepository todoRepository) {
        this.todoListConverter = todoListConverter;
        this.todoRepository = todoRepository;
    }

    public List<TodoListDto> getTodoLists() {
       return StreamSupport.stream(todoRepository.findAll().spliterator(), false)
                .map(todoListConverter::convert)
                .collect(Collectors.toList());
    }
}
