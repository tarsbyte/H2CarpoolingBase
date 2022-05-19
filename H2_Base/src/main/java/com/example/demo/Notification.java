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
@Table(name = "NOTIFICATIONS")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="notifyID")
    private Long id;


    private String text;

    private LocalTime time;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="userID")
    private User receiver;

    public Notification(String text, LocalTime time, LocalDate date, User receiver) {
        this.text = text;
        this.time = time;
        this.date = date;
        this.receiver = receiver;
    }

    public Notification() {

    }
}
