package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@DiscriminatorValue("1")
public class PassengerRate extends UserRate{

    public PassengerRate()
    {

    }
}
