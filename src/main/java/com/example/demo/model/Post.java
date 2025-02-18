package com.example.demo.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id,String text, Date creationDate, Integer likes){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = likes;
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
