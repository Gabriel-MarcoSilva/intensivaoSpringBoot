package com.intensivao.intense.entites;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_GAME")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="game_name")
    private String name;

    @Column(name="game_year") //transforma o nome da variável pra game_year
    private Integer year;
    private String genre;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    
    @Column(columnDefinition = "TEXT")
    private String longDescription;
    private String platforms;

    public Game(){

    }

    public Game(long id, String name, Integer year, String genre, String imgUrl, String shortDescription, String longDescription, String platforms){
        setId(id);
        setName(name);
        setYear(year);
        setImgUrl(imgUrl);
        setGenre(genre);
        setShortDescription(shortDescription);
        setLongDescription(longDescription);
        setPlatforms(platforms);
        setScore(score);;
    }
    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
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
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
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


    //verifica se um jogo é igual ao outro
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }
}
