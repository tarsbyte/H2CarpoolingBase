package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Getter
@Setter
@Table(name = "BOOKEDOFFERS")
public class BookedOffer extends Offer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="offerID")
    private Long id;

    private boolean paid;

    public BookedOffer(User user, String startLocation, String destinationLocation, LocalDate rideStartDate, LocalDate rideEndDate, LocalTime arrivalTime, LocalTime rideDuration, String description, int numOfPassengers, double price, boolean paid) {
        super(user, startLocation, destinationLocation, rideStartDate, rideEndDate, arrivalTime, rideDuration, description, numOfPassengers, price);
        this.paid = paid;
    }

    public BookedOffer() {

    }

}
