package com.company.two;

public class Book {
    private String name;
    private String author;
    private String genre;

    public Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public void read(){
        System.out.println("Start reading " + this.name + "(genre - " + this.genre + " author - " + this.author + ")");
    }
    public String getName() {
        return name;
    }

    public String toString(){
        return this.name + " " + this.author + " " + this.genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
