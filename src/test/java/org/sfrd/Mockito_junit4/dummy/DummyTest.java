package org.sfrd.Mockito_junit4.dummy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class DummyTest {
    @Test
    public void demoDummy()
    {
      BookRepository bookRepository=  new FakeBookRepository();
        EmailService emailService = new DummyEmailService();
        BookService bookService = new BookService(bookRepository,emailService);
        bookService.AddBook(new Book("12", "WingsOfFire", 2000, LocalDate.now()));
        bookService.AddBook(new Book("124", "IntoTheCore", 3000, LocalDate.now()));

        assertEquals(2, bookService.FindNumberOfBooks());
    }
    @Test
    public void demoDummyUsingMockito()
    {
        BookRepository bookRepository = mock(BookRepository.class);
        EmailService emailService=mock(EmailService.class);
        BookService bookService=new BookService(bookRepository,emailService);

        Book book1=new Book("12","WingsOfFire",2000, LocalDate.now());
        Book book2=new Book("124","IntoTheCore",3000, LocalDate.now());
        Collection books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Mockito.when(bookRepository.findAll()).thenReturn(books);
        assertEquals(2, bookService.FindNumberOfBooks());
    }
}