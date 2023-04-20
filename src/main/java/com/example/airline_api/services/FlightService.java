package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    Passenger passenger;

//    this method needs to create a new flight object
//    and then add that flight object to the list of flights
//    which is in the Passenger class
    public void addNewFlight(Flight flight) {
        Flight flight1 = new Flight(flight.getDestination(), flight.getCapacity(), flight.getDepartureTime(), flight.getDepartureTime());
        passenger.addFlights(flight1);
    }
}
