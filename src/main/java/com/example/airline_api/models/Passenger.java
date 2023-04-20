package com.example.airline_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @JsonIgnoreProperties({"passengers"})
    @ManyToMany
    @JoinTable(
        name = "passengers_flights",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "estate_id")
    )
    private List<Flight> flightList;

    public Passenger(String name, String email){
        this.name = name;
        this.email = email;
    }
//    DEFAULT CONSTRUCTOR
    public Passenger(){

    }
// METHODS
//    1. ADD FLIGHTS TO PASSENGER OBJECT:

    public void addFlights(Flight flight){
        this.flightList.add(flight);
    }


//    GETTERS AND SETTER


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}
