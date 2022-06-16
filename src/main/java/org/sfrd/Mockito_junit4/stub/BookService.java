package org.sfrd.Mockito_junit4.stub;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    //now create constructor to get a hold of bookrepository
    public BookService(BookRepository bookRepository){

        this.bookRepository=bookRepository;
    }

   //let us say that there is list of books with price after discount like 7 books
    //then
    public List<Book>getNewBooksWithAppliedDiscount(int discountRate,int days)
    {
List<Book> newBooks=bookRepository.findNewBooks(days);
//500 to 10% discount which is 450
        for(Book book:newBooks)
        {
            int price = book.getPrice();
            int newprice=price-(discountRate*price/100);
            book.setPrice(newprice);
        }
        return newBooks;
    }
}
