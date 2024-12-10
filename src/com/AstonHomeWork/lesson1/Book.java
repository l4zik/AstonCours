package com.AstonHomeWork.lesson1;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга: " + title + " - успешно взята.");
        } else {
            System.out.println("Книга: " + title + " - уже у вас на руках.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга: " + title + " - возвращена.");
    }

    public void displayInfo() {
        System.out.println("Книга называется: " + title);
        System.out.println("Автор книги: " + author);
        System.out.println("Книга выпущена в " + year + " году");
        System.out.println("Книга есть в наличии: " + isAvailable);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
