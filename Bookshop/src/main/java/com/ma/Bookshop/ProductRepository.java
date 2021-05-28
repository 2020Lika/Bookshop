package com.ma.Bookshop;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    List<Book> products;

    List<Book> findAll() {
        return this.products;
    }
}