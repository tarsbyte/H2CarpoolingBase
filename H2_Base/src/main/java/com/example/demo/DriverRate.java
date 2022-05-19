package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Getter
@Setter
@DiscriminatorValue("2")
public class DriverRate extends UserRate{

    private double price;
    private double comfort;

    public DriverRate(double punctuality, double politeness, double safety, double price, double comfort) {
        super(punctuality, politeness, safety);
        this.price = price;
        this.comfort = comfort;
    }

    public DriverRate() {

    }

}
