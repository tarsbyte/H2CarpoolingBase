package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Table(name = "OFFERS")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="offerID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="userID")
    private User user;

    private String startLocation;
    private String destinationLocation;
    private LocalDate rideStartDate;
    private LocalDate rideEndDate;
    private LocalTime arrivalTime;
    private LocalTime rideDuration;
    private String description;
    private int numOfPassengers;
    private double price;


    public Offer(User user, String startLocation, String destinationLocation,
                 LocalDate rideStartDate, LocalDate rideEndDate, LocalTime arrivalTime,
                 LocalTime rideDuration, String description, int numOfPassengers, double price) {
        this.user = user;
        this.startLocation = startLocation;
        this.destinationLocation = destinationLocation;
        this.rideStartDate = rideStartDate;
        this.rideEndDate = rideEndDate;
        this.arrivalTime = arrivalTime;
        this.rideDuration = rideDuration;
        this.description = description;
        this.numOfPassengers = numOfPassengers;
        this.price = price;
    }

    public Offer() {

    }

}
