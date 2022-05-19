package com.example.SpringBootPjF1.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String series;
    private String country;
    private String circuit;



//Constructors


    public Category(Long id, String series, String country, String circuit, Set<Driver> names) {
        this.id = id;
        this.series = series;
        this.country = country;
        this.circuit = circuit;
        this.names = names;
    }

    @ManyToMany //Many drivers can be in different categories of motorsport
    private Set<Driver> names;

    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public Set<Driver> getNames() {
        return names;
    }

    public void setNames(Set<Driver> names) {
        this.names = names;
    }
}
