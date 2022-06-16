package org.sfrd.Mockito_junit4.fake;

public class BookService {
    private BookRepository bookRepository;
    //now create constructor to get a hold of bookrepository
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public void AddBook(Book book)
    {
        bookRepository.save(book);
    }
    public int FindNumberOfBooks()
    {
        return bookRepository.findAll().size();
        //will return collection from fake database
    }
}
