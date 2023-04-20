package com.example.airline_api.controllers;

import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "passengers")
public class PassengerController {


    @Autowired
    PassengerService passengerService;

//    Add a new passenger

//    Display details of all passengers

//    Display details of a specific passenger

//    Book a passenger on to a flight

}
