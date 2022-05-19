package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@Table(name="STATS")
public class Statistics {
    public Statistics(int ridesTaken, int ridesGiven, UserRate userRate) {
        this.ridesTaken = ridesTaken;
        this.ridesGiven = ridesGiven;
        this.userRate = userRate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="statsID")
    private Long id;

    private int ridesTaken;
    private int ridesGiven;

    @OneToOne
    @JoinColumn(name="rateID")
    private UserRate userRate;

    public Statistics() {
    }

}
