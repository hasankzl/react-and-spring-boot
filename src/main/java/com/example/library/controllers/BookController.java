package com.example.library.controllers;


import com.example.library.models.Book;
import com.example.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/save")
    public void save(@RequestBody Book book){
        bookRepository.save(book);
    }

    @GetMapping("/getAll")
    public List<Book> getAll(){

        return bookRepository.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){

        bookRepository.deleteById(id);
    }
}
