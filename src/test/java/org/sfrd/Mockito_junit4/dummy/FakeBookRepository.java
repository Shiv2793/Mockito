package org.sfrd.Mockito_junit4.dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
//we can use in memory database,hash map, list as a database

    Map<String, Book> bookStore=new HashMap<>();

    @Override
    public void save(Book book) {
      bookStore.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
