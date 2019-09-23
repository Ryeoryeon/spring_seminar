package com.endlesscreation.spring.services;

import com.endlesscreation.spring.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Bookservice {
    public ArrayList<Book> getBooks;
    private ArrayList<Book> Books;
    public Bookservice(){
        this.Books=new ArrayList<>();
    }

    public void addBooks(Book book){
        Books.add(book);
    }

    public ArrayList<Book>getBooks(){
        return Books;
    }

    public Book getBookById(int id){
        //리스트만큼 반복 돌리기
        for(Book num : Books){
            if(num.getId()==id){
                return num;
            }
        }

        return null;
    }

    public boolean updateBook(int id, Book updateBook){
        for(Book num : Books){
            if(num.getId()==id){
                num.setName(updateBook.getName());
                num.setAuthor(updateBook.getAuthor());
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(int id){
        for(Book num : Books){
            if(num.getId()==id){
                Books.remove(num);
                return true;
            }
        }
        return false;
    }

}
