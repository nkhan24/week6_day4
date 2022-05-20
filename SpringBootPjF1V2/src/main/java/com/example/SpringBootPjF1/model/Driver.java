package com.example.SpringBootPjF1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Driver {

    //Defining objects with types
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private int titles;

    //Connects the relationship from the Constructor Class to the Driver class
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructor;


    //Relationship defined by annotation OneToMany, Foreign key is contained within Formula class
    //Since mappedBy method indicates that entity on this side is the inverse of the relationship
    //CascadeType.ALL allows Hibernate to propagate all actions


    @ManyToMany(cascade = CascadeType.ALL) //many categories can contain different drivers of same series
    @JoinTable(
            name = "Race",
            joinColumns = @JoinColumn(name = "driver_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    @JsonIgnoreProperties(value = {"names"})
    private Set<Category> race;

// Constructors

    public Driver() {}

    public Driver(Long id, String first_name, String last_name, int titles, Constructor constructor, Set<Category> race) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.titles = titles;
        this.constructor = constructor;
        this.race = race;
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

    public Set<Category> getRace() {
        return race;
    }

    public void setRace(Set<Category> race) {
        this.race = race;
    }
}
