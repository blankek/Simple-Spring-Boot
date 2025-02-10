package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post first = new Post("Первый элемент",15);
        Post second = new Post("Второй элемент", 10);
        Post third = new Post("Третий элемент", 12);

        List<Post> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        return list;
    }
}
