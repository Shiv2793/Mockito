package org.sfrd.Mockito_junit4.dummy;

public class BookService {
    private BookRepository bookRepository;
    private EmailService emailService;
    //now create constructor to get a hold of bookrepository and emailService
    public BookService(BookRepository bookRepository, EmailService emailService){

        this.bookRepository=bookRepository;
        this.emailService=emailService;
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
    //other methods which use EmailService

}
