package com.pluralsight.springdataoverview.repository;

import com.pluralsight.springdataoverview.entity.Flight;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class DeleteByOriginRepositoryTest extends TestCase {

    @Autowired
    private FlightRepository flightRepository;

    public void testAddByOrigin() {
        Flight flight = new Flight();
        flight.setOrigin("London");
        flight.setDestination("Paris");
        flight.setScheduledAt(LocalDateTime.now());
        flightRepository.save(flight);

        List<Flight> flights = flightRepository.findByOrigin("London");
        assertEquals(1, flights.size());

    }
}