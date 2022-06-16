package org.sfrd.Mockito_junit4.stub;

//import java.awt.print.Book;

import java.util.List;

//in real world project bookservice is part of service layer and Bookrepo
//is a part of DO layer
public interface BookRepository {
    List<Book> findNewBooks(int days);

    //this is just an interface of BookRepository we haven't provided implementation of that
    //in other file BookService let us provide implementation of this BookRepository
}
