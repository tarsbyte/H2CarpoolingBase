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
@Table(name="HISTORICALPAYMENTS")
public class HistoricalPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payID")
    private Long id;

    private LocalTime time;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="driverID")
    private User serviceProvider;

    @ManyToOne
    @JoinColumn(name="clientID")
    private User client;

    private double paymentValue;

    @OneToOne
    @JoinColumn(name="offerID")
    private Offer offer;

    public HistoricalPayment(LocalTime time, LocalDate date, User serviceProvider, User client, double paymentValue, Offer offer) {
        this.time = time;
        this.date = date;
        this.serviceProvider = serviceProvider;
        this.client = client;
        this.paymentValue = paymentValue;
        this.offer = offer;
    }

    public HistoricalPayment() {

    }

}
