package io.github.rxcats.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setIsbn("0618260307");
        book.setTitle("The Hobbit");
        book.setAuthor("J. R. R. Tolkien");
        book.setGender(Gender.male);
        books.add(book);

        return books;
    }

}
