package com.example.SpringBootPjF1.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Constructor {
    //Defining objects with types
    @Id
    @GeneratedValue
    private Long id;
    private String team;
    private int titles;


    //Relationship defined by annotation OneToMany, Foreign key is contained within Driver class
    //Since mappedBy method indicates that entity on this side is the inverse of the relationship
    //CascadeType.ALL allows Hibernate to propagate all actions
@OneToMany (mappedBy = "constructor", cascade = CascadeType.ALL)
private List<Driver> drivers;

// Constructors
    public Constructor(Long id, String team, int titles, List<Driver> constructors) {
        this.id = id;
        this.team = team;
        this.titles = titles;
        this.drivers = constructors;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public List<Driver> getConstructors() {
        return drivers;
    }

    public void setConstructors(List<Driver> constructors) {
        this.drivers = constructors;
    }
}
