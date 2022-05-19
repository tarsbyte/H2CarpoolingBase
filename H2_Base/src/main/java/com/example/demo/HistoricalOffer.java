package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Entity
@Getter
@Setter
@Table(name = "HISTORICALOFFERS")
public class HistoricalOffer extends Offer{
    private boolean tookPlace;

    public HistoricalOffer(User user, String startLocation, String destinationLocation, LocalDate rideStartDate, LocalDate rideEndDate, LocalTime arrivalTime, LocalTime rideDuration, String description, int numOfPassengers, double price, boolean tookPlace) {
        super(user, startLocation, destinationLocation, rideStartDate, rideEndDate, arrivalTime, rideDuration, description, numOfPassengers, price);
        this.tookPlace = tookPlace;
    }

    public HistoricalOffer()
    {
    }
}
