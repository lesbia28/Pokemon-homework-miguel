package com.ironhack.pokemonservice.controller.dto;

public class TrainerDTO {
    private Long id;
    private String name;
    private Integer age;
    private String city;
    private String hobby;
    private String picture;

    public TrainerDTO() {
    }

    public TrainerDTO(Long id, String name, Integer age, String city, String hobby, String picture) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.hobby = hobby;
        this.picture = picture;
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
