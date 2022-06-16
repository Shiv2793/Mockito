package org.sfrd.Mockito_junit4.mock;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MockTest {
    @Test
    public void demoMock()
    {
        BookRepositoryMock bookRepositoryMock= new BookRepositoryMock();
     BookService bookService = new BookService(bookRepositoryMock);

    Book book1=new Book("1", "Java", 2000, LocalDate.now());
    Book book2=new Book("2", "Python", 500, LocalDate.now());

        bookService.AddBook(book1);
        bookService.AddBook(book2);
        bookRepositoryMock.verify(book2,1);
        //here verify is method belonging to mockrepository
        //test verify that mockrepository was called by
        //the fact that book2 is loaded and count times is incremented
        //because book1 is greater than 500 which is no return case in BookRepository
       // assertEquals(0,bookRepositorySpy.timesCalled());
       // assertTrue(bookRepositorySpy.calledwith(book1));
        //assertTrue(bookRepositorySpy.calledwith(book2));

    }
}
