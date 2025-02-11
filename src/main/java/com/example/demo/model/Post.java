package com.example.demo.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date creationDate, Integer likes){
        this.text=text;
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
}
