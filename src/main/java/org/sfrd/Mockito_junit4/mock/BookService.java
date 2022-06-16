package org.sfrd.Mockito_junit4.mock;

public class BookService {
    private BookRepository bookRepository;

    //now create constructor to get a hold of bookrepository
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void AddBook(Book book) {
        if (book.getPrice() >1000) {
            return;
        }
        bookRepository.save(book);


    }
}
