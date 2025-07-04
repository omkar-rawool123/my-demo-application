package com.example.com.example.Model;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class BookExamples {
    public static void main(String[] args) {
        List<Book> books = Library.getBooks();

//        Find all books that are available and print their titles
        List<String> availableBooksTitles = books.stream().filter(Book::isAvailable).map(Book::getTitle).toList();
        System.out.println("Available Books Titles: " + availableBooksTitles);

//        Get a list of books written before the year 1950.
        List<Book> booksBefore1950 = books.stream().filter(book -> book.getYear() < 1950).toList();
        System.out.println("Books written before 1950: " + booksBefore1950);

//        Calculate the average price of all books in the list.
        double average = books.stream().mapToDouble(a -> a.getPrice()).average().getAsDouble();
        System.out.println("average = " + average);

        //  Find the most expensive book and print its details.
        Double v = books.stream().max(Comparator.comparing(Book::getPrice)).map(book1 -> book1.getPrice() * 2).get();
        System.out.println("Most expensive book: " + v);
    }
}
