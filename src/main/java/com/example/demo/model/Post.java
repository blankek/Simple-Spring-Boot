package com.example.demo.model;

import javax.xml.crypto.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;


    public Post(Long id,String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }
    public Post() {
    }


    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
