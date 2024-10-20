package com.javaforfun.model;

public class Book {

    private String name;
    private int bookId;

    public Book() {
    }
    
    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public int getBookId() {
        return bookId;
    }   

public Book setBookId(int employeeId) {
        this.bookId = employeeId;
        return this;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", bookId=" + bookId + "]";
    }
}
