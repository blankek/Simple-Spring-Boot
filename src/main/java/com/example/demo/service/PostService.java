package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post first = new Post("Первый элемент",new Date(), 15);
        Post second = new Post("Второй элемент",new Date(), 10);
        Post third = new Post("Третий элемент",new Date(), 12);

        List<Post> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        return list;
    }
}
