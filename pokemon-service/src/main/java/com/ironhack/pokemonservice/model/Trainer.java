package com.ironhack.pokemonservice.model;

import javax.persistence.*;

@Entity
@Table(name = "trainers")
public class Trainer {

    // default picture for trainer
    private static final String DEFAULT_PICTURE =
        "https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String city;
    private String hobby;
    private String picture;

    // Constructors
    public Trainer() {
    }

    public Trainer(String name, Integer age, String city,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.city = city;
        this.picture = DEFAULT_PICTURE;
    }

    public Trainer(String name, Integer age, String city,String hobby, String picture) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.hobby = hobby;
        this.picture = picture;
    }

    // Getters & setters
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
