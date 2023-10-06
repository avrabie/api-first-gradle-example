package com.example.apifirstgradle1.controllers;


import com.example.apifirstgradle1.api.BooksApi;
import com.example.apifirstgradle1.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class IakaMyController implements BooksApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return BooksApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> createbook(Book book) {
        return BooksApi.super.createbook(book);
    }

    @Override
    public ResponseEntity<Void> deletebook(String bookId) {
        return BooksApi.super.deletebook(bookId);
    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<Book> getbook(String bookId) {
        Book book = new Book();
        book.setIsbn("1234567890");
        book.setTitle("Iaka");
        book.setAuthor("Iaka");
        book.setCost(100.0);
        return ResponseEntity.ok(book);

    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Book>> getbooks() {
        Book book = new Book();
        book.setIsbn("1234567890");
        book.setTitle("Iaka");
        book.setAuthor("Iaka");
        book.setCost(100.0);
        return ResponseEntity.ok(List.of(book));
    }

    @Override
    public ResponseEntity<Void> updatebook(String bookId, Book book) {
        return BooksApi.super.updatebook(bookId, book);
    }
}
