package com.example.SpringBootPjF1.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
public class Driver {
    //Defining objects with types
    @Id
    @GeneratedValue
    private Long id;
    private String first_name;
    private String last_name;
    private int titles;

    //Connects the relationship from the Constructor Class to the Driver class
    @ManyToOne
    private Constructor constructor;


    //Relationship defined by annotation OneToMany, Foreign key is contained within Formula class
    //Since mappedBy method indicates that entity on this side is the inverse of the relationship
    //CascadeType.ALL allows Hibernate to propagate all actions
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL) //connects one of drivers to Formula class
    private List<Formula> races;

    @ManyToMany //many categories can contain different drivers of same series
    private Set<Category> race;

// Constructors
    public Driver(Long id, String first_name, String last_name, int titles, Constructor constructor, List<Formula> races) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.titles = titles;
        this.constructor = constructor;
        this.races = races;
    }
//Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public List<Formula> getRaces() {
        return races;
    }

    public void setRaces(List<Formula> races) {
        this.races = races;
    }
}
