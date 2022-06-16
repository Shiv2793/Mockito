package org.sfrd.Mockito_junit4.dummy;

//import java.awt.print.Book;

import java.util.Collection;

//in real world project bookservice is part of service layer and Bookrepo
//is a part of DO layer
public interface BookRepository {
    void save(Book book);
    //now to get collection of books in the database
    Collection<Book> findAll();
    //this is just an interface of BookRepository we haven't provided implementation of that
    //in other file BookService let us provide implementation of this BookRepository
}
