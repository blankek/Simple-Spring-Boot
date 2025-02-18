package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text ){
        Long id =(long) posts.size();
        posts.add(new Post(id ,text, new Date(), 0));
    }
}
