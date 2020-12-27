package com.example.library.controllers;

import com.example.library.models.Genre;
import com.example.library.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {

    @Autowired
    GenreRepository genreRepository;

    @PostMapping("/save")
    void save(@RequestBody Genre genre){
        genreRepository.save(genre);
    }

    @GetMapping("/getAll")
    List<Genre> getAll(){
        return genreRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id){

        genreRepository.deleteById(id);
    }
}
