package com.example.airline_api.controllers;


import com.example.airline_api.models.Flight;
import com.example.airline_api.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "flights")
public class FlightController {

    @Autowired
    FlightService flightService;

//    Add details of a new flight
//    Put request to flights and add(update) a new flight
    @PutMapping
    public ResponseEntity<Flight> addNewFlight(@RequestBody Flight flight){
        flightService.addNewFlight(flight);
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

//    Display all available flights
//    Get request to read all the available flights
    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(Flight flight){
        return new ResponseEntity<>(flightService.findAllFlights(), HttpStatus.OK);
    }

//    Display details of a specific flight
//    this will be a get request
    @GetMapping(value ="{/id}")
    public ResponseEntity<Flight> findFlightById(@PathVariable Long id){
        Flight flight = flightService.findFlightById(id);
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

//    Cancel a flight
//    this will be a delete request
//    what parameter will be taken in to delete the flight?

    @DeleteMapping(value ="{/id}")
    public ResponseEntity<Long> deleteFlight(Long id){
        flightService.deleteFlightFromFlightList(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
