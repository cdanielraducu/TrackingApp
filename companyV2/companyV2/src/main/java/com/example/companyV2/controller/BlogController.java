package com.example.companyV2.controller;

import com.example.companyV2.Repositories.BlogRepository;
import com.example.companyV2.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
    }


}
