package com.hillel.Homework05.BooksByAuthors;

public class Author {
    public String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}