package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@Table(name="USERRATES")
@DiscriminatorColumn(name="type",
        discriminatorType = DiscriminatorType.INTEGER)
public class UserRate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="rateID")
    private Long id;

    private double punctuality;
    private double politeness;
    private double safety;

    public UserRate(double punctuality, double politeness, double safety) {
        this.punctuality = punctuality;
        this.politeness = politeness;
        this.safety = safety;
    }

    public UserRate() {

    }

}
