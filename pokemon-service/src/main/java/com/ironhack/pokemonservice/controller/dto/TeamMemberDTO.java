package com.ironhack.pokemonservice.controller.dto;

public class TeamMemberDTO {

    private Long id;
    private String name;
//    private String type;

    public TeamMemberDTO() {
    }

    public TeamMemberDTO(Long id, String name) {
        this.id = id;
        this.name = name;
//        this.type = type;
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

//    public String getType() {
//        return type;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }
}
