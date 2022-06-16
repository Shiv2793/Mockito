package org.sfrd.Mockito_junit4.stub;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StubTest {

    @Test
    public void demoStub()
    {
        BookRepository bookRepository=new BookRespositoryStub();
        BookService bookService=new BookService(bookRepository);
        List<Book> newBooKsWithAppliedDiscount=bookService.getNewBooksWithAppliedDiscount(10,7);
   assertEquals(2,newBooKsWithAppliedDiscount.size());
   assertEquals(1800,newBooKsWithAppliedDiscount.get(0).getPrice());
   assertEquals(900,newBooKsWithAppliedDiscount.get(1).getPrice());
    }
    @Test
    public void demoStubUsingMockito()
    {
        BookRepository bookRepository=mock(BookRepository.class);
        BookService bookService=new BookService(bookRepository);
        List<Book> newBooKsWithAppliedDiscount=bookService.getNewBooksWithAppliedDiscount(10,7);

        Book book1=new Book("1","Java",1000, LocalDate.now());
        Book book2=new Book("2","C++",2000,LocalDate.now());

        List<Book> newbooks=new ArrayList<>();
        newbooks.add(book1);
        newbooks.add(book2);

        when(bookRepository.findNewBooks(7)).thenReturn(newbooks);


        assertEquals(2,newBooKsWithAppliedDiscount.size());
        assertEquals(1800,newBooKsWithAppliedDiscount.get(0).getPrice());
        assertEquals(900,newBooKsWithAppliedDiscount.get(1).getPrice());
    }
}
