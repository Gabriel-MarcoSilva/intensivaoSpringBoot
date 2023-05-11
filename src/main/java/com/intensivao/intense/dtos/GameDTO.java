package com.intensivao.intense.dtos;

import com.intensivao.intense.entites.Game;

public class GameDTO {

    private Long id;
    private String name;
    private Integer year;
    private String imgUrl;
    private String shortDescription; 

    public GameDTO(){

    }

    public GameDTO( Game entity){
        setId(entity.getId());
        setImgUrl(entity.getImgUrl());
        setName(entity.getName());
        setShortDescription(entity.getShortDescription());
        setYear(entity.getYear());        
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
