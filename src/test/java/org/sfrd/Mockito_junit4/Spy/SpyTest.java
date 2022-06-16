package org.sfrd.Mockito_junit4.Spy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpyTest {
    @Test
    public void demoSpy()
    {
        BookRepositorySpy bookRepositorySpy= new BookRepositorySpy();
        BookService bookService = new BookService(bookRepositorySpy);

        Book book1=new Book("1", "Java", 2000, LocalDate.now());
        Book book2=new Book("2", "Python", 500, LocalDate.now());

        bookService.AddBook(book1);
        //bookService.AddBook(book2);
        assertEquals(0,bookRepositorySpy.timesCalled());
       // assertTrue(bookRepositorySpy.calledwith(book1));
        //assertTrue(bookRepositorySpy.calledwith(book2));

    }
}
