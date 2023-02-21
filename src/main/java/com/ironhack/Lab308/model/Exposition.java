package com.ironhack.Lab308.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Exposition extends Event {

    public Exposition(Date date, String title, int duration, String location, List<Guest> guests) {
        super(date, title, duration, location, guests);
    }

    public Exposition(){

    }

}
