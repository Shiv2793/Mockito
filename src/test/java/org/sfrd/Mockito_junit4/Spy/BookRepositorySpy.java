package org.sfrd.Mockito_junit4.Spy;


public class BookRepositorySpy implements BookRepository  {


    int saveCalled=0;
    Book lastAddedBook=null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lastAddedBook=book;
    }
    public int timesCalled()
    {
        return saveCalled;
    }
    public boolean calledwith(Book book)
    {
        return lastAddedBook.equals(book);
    }
}
