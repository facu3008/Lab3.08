package com.ironhack.Lab308.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(Date date, String title, int duration, String location, List<Guest> guests, List<Speaker> speakers) {
        super(date, title, duration, location, guests);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
