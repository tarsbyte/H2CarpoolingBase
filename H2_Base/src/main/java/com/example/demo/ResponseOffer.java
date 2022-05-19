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
@Table(name = "RESPONSES")
public class ResponseOffer extends Offer{
    public ResponseOffer(User user, String startLocation, String destinationLocation, LocalDate rideStartDate, LocalDate rideEndDate, LocalTime arrivalTime, LocalTime rideDuration, String description, int numOfPassengers, double price, String carBrand, String carModel, LocalTime startTime) {
        super(user, startLocation, destinationLocation, rideStartDate, rideEndDate, arrivalTime, rideDuration, description, numOfPassengers, price);
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.startTime = startTime;
    }

    public ResponseOffer() {

    }

    private String carBrand;
    private String carModel;
    private LocalTime startTime;
}
