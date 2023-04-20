package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//    add flights to a passenger object:
//        make a new flight going to jamaica and save that to flight repo
        Flight toJamaica = new Flight("Jamaica", 100, "12/03/2020", "10:30");
        flightRepository.save(toJamaica);
//          make a passenger object and add the flight to passengerOne
        Passenger passengerOne = new Passenger("John", "john@gmail.com");
        passengerOne.addFlights(toJamaica);
        passengerRepository.save(passengerOne);
//          make another passenger object and addd the same flight
        Passenger passengerTwo = new Passenger("Jane", "jane@gmailcom");
        passengerTwo.addFlights(toJamaica);
        passengerRepository.save(passengerOne);

//        make a flight to England
        Flight toEngland = new Flight("England", 200, "30/03/2022", "21:30");
        flightRepository.save(toEngland);
//        make passengers for this flight (add passengerTwo to this flight as well)
//        add passengerTwo
        passengerTwo.addFlights(toEngland);
        passengerRepository.save(passengerTwo);

//        make a new passengerThree and add them to England
        Passenger passengerThree = new Passenger("Jack", "jack@gmail.com");
        passengerThree.addFlights(toEngland);
        passengerRepository.save(passengerThree);

//        make one more flight and add passengerThree to it
        Flight toChina = new Flight("China", 150, "10/10/2021", "15:30");
        flightRepository.save(toChina);

//        adding passengerThree
        passengerThree.addFlights(toChina);
        passengerRepository.save(passengerThree);

//        have populated the dataloader





    }
}
