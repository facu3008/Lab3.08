package com.ironhack.Lab308.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String title;
    private int duration;
    private String location;

    @ManyToMany
    @JoinTable(
            name = "EventGuests",
            joinColumns = {@JoinColumn(name = "eventId", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "guestId", referencedColumnName = "id")}
    )
    private List<Guest> guests;

    public Event() {
    }

    public Event(Date date, String title, int duration, String location, List<Guest> guests) {
        this.date = date;
        this.title = title;
        this.duration = duration;
        this.location = location;
        this.guests = guests;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
