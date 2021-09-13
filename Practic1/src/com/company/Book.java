package com.company;

public class Book {
    private String name;
    private String author;
    private int numberOfPages;

    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
        this.name="";
        this.author="";
        this.numberOfPages=-1;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book - " + this.name + "\nAuthor - " + this.author + "\nNumber of pages - " + this.numberOfPages;
    }
}
