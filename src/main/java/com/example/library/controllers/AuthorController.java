package com.example.library.controllers;


import com.example.library.models.Author;
import com.example.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @PostMapping("/save")
    void save(@RequestBody Author author){
        authorRepository.save(author);
    }

    @GetMapping("/getAll")
    List<Author> getAll(){
        return authorRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id){
        authorRepository.deleteById(id);
    }
}
