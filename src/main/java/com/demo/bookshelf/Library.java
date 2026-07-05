package com.demo.bookshelf;

import java.util.ArrayList;
import java.util.List;

/**
 * An in-memory bookshelf.
 */
public class Library {

    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> all() {
        return List.copyOf(books);
    }

    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(b -> b.author().equalsIgnoreCase(author))
                .toList();
    }
}
