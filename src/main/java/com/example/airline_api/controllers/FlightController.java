package com.example.airline_api.controllers;


import com.example.airline_api.models.Flight;
import com.example.airline_api.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

//    Display details of a specific flight

//    Cancel a flight


}
