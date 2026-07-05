package com.demo.bookshelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {

    @Test
    void addedBooksAreListed() {
        Library library = new Library();
        library.add(new Book("Clean Code", "Robert C. Martin", 2008));

        assertEquals(1, library.all().size());
    }

    @Test
    void findByAuthorIsCaseInsensitive() {
        Library library = new Library();
        library.add(new Book("Clean Code", "Robert C. Martin", 2008));
        library.add(new Book("Refactoring", "Martin Fowler", 1999));

        assertEquals(1, library.findByAuthor("robert c. martin").size());
        assertTrue(library.findByAuthor("nobody").isEmpty());
    }
}
