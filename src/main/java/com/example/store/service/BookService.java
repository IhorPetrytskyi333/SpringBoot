package com.example.store.service;

import antlr.collections.List;
import com.example.store.model.Book;

public interface BookService {
    Book save(Book book);

    List findAll();
}
