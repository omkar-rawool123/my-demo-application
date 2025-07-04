package com.example.com.example.Model;

import java.util.List;
import java.util.Arrays;

class Book {
    private String title;
    private String author;
    private double price;
    private int year;
    private String genre;
    private boolean isAvailable;

    public Book(String title, String author, double price, int year, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

class Library {

    public static List<Book> getBooks() {
        return Arrays.asList(
                new Book("The Catcher in the Rye", "J.D. Salinger", 10.99, 1951, "Fiction", true),
                new Book("To Kill a Mockingbird", "Harper Lee", 7.99, 1960, "Fiction", true),
                new Book("1984", "George Orwell", 6.99, 1949, "Dystopian", false),
                new Book("Moby Dick", "Herman Melville", 12.99, 1851, "Adventure", true),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 1925, "Fiction", false),
                new Book("War and Peace", "Leo Tolstoy", 15.99, 1869, "Historical", true),
                new Book("Pride and Prejudice", "Jane Austen", 5.99, 1813, "Romance", true),
                new Book("The Hobbit", "J.R.R. Tolkien", 8.99, 1937, "Fantasy", true),
                new Book("Brave New World", "Aldous Huxley", 6.99, 1932, "Dystopian", true),
                new Book("Ulysses", "James Joyce", 13.99, 1922, "Modernist", false)
        );
    }

    public static void main(String[] args) {

    }
}
