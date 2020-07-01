package com.sample.demo;

public class Book {
    private String id;
    private String bookName;
    private String authorName;
    private int noOfPages;

    public Book(String id, String bookName, String authorName, int noOfPages) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.noOfPages = noOfPages;
    }


    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
