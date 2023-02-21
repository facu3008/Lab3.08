package com.ironhack.Lab308.model;

import com.ironhack.Lab308.enums.GuestStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToMany(mappedBy = "guests")
    private List<Event> event;

    public Guest() {
    }

    public Guest(String name, GuestStatus status, List<Event> event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }
}
