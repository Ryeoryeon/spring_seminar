package com.endlesscreation.spring.controllers;

import com.endlesscreation.spring.models.Book;
import com.endlesscreation.spring.services.Bookservice;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class Bookcontroller {

    @Autowired
    private Bookservice bookservice;

    @RequestMapping(method= RequestMethod.POST)
    public void addBooks(@RequestBody Book book){
        bookservice.addBooks(book);
    }

    @RequestMapping(method= RequestMethod.GET)
    public ArrayList<Book> getBooks(){
        return bookservice.getBooks();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Book getBookByID(@PathVariable("id") int id){
        return bookservice.getBookById(id);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public boolean updateBook(@PathVariable("id") int id, @RequestBody Book update){
        return bookservice.updateBook(id,update);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public boolean deleteBook(@PathVariable("id") int id){
        return bookservice.deleteBook(id);
    }
}
