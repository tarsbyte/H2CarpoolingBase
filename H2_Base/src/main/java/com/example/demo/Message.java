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
@Table(name = "MESSAGES")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="msgID")
    private Long id;

    private String text;

    private LocalTime time;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="authorID")
    private User author;

    public Message(String text, LocalTime time, LocalDate date, User author, User receiver) {
        this.text = text;
        this.time = time;
        this.date = date;
        this.author = author;
        this.receiver = receiver;
    }

    @ManyToOne
    @JoinColumn(name="receiverID")
    private User receiver;


    public Message() {

    }
}
