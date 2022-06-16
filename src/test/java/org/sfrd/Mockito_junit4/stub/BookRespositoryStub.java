package org.sfrd.Mockito_junit4.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRespositoryStub implements BookRepository {
    @Override
    public List<Book> findNewBooks(int days)
    {
        List<Book> newBooks=new ArrayList<>();
        Book book1= new Book("12","WingsOfFire",2000, LocalDate.now());
        Book book2= new Book("124","Farmer",1000, LocalDate.now());

        newBooks.add(book1);
        newBooks.add(book2);
        return newBooks;
    }

}
