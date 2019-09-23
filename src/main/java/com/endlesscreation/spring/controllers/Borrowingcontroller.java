package com.endlesscreation.spring.controllers;

import com.endlesscreation.spring.models.Borrowing;
import com.endlesscreation.spring.services.Bookservice;
import com.endlesscreation.spring.services.Borrowingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowing")
public class Borrowingcontroller {
    @Autowired
    private Borrowingservice borrowingservice;

    @GetMapping
    private List<Borrowing> getAllBorrowings(){
        return borrowingservice.getAllborrowing();
    }

    @GetMapping("/{id}")
    private Borrowing getBorrowingById(@PathVariable int id){
        return borrowingservice.getBorrowingById(id);
    }

    @PostMapping("{memberid}/{bookid}")
    public void borrow(@PathVariable String memberid, @PathVariable int bookid){
        borrowingservice.borrow(memberid,bookid);
    }

    @PutMapping("{memberid}/{bookid}")
    public void returnBook(@PathVariable String memberid, @PathVariable int bookid){
        borrowingservice.returnBook(memberid,bookid);
    }
}
