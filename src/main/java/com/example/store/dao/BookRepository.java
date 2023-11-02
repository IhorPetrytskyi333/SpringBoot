package com.example.store.dao;

import antlr.collections.List;
import com.example.store.model.Book;

public interface BookRepository {
    Book save(Book book);

    List fidAll();
}
