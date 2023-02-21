package com.ironhack.Lab308.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String disctrict;
    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    public Chapter() {
    }

    public Chapter(String name, String disctrict, Member president, List<Member> members) {
        this.name = name;
        this.disctrict = disctrict;
        this.president = president;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisctrict() {
        return disctrict;
    }

    public void setDisctrict(String disctrict) {
        this.disctrict = disctrict;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
