package org.sfrd.Mockito_junit4.Spy;

//import java.awt.print.Book;

//in real world project bookservice is part of service layer and Bookrepo
//is a part of DO layer
public interface BookRepository {
    void save(Book book);
    //now to get collection of books in the database
    //this is just an interface of BookRepository we haven't provided implementation of that
    //in other file BookService let us provide implementation of this BookRepository
}
