package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userID")
    private Long id;

    private String phoneNumber;
    private String description;

    @Column(name="AVATAR_PATH")
    private String avatar;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Offer> reservations;

    @OneToOne
    @JoinColumn(name="statsID")
    private Statistics statistics;

    @OneToOne
    @JoinColumn(name="credentialsID")
    private UserCredentials userCredentials;

    @OneToOne
    @JoinColumn(name="mediasID")
    private SocialMedia socialMedia;

    public User(String phoneNumber,  String avatar, String description, Statistics statistics, UserCredentials userCredentials, SocialMedia socialMedia) {
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.avatar = avatar;
        this.statistics = statistics;
        this.userCredentials = userCredentials;
        this.socialMedia = socialMedia;
    }

    public void addReservation(Offer offer)
    {
        this.reservations.add(offer);
    }

    public User() {

    }
}
