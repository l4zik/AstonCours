package com.AstonHomeWork.lesson1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Метро 2033", "Дмитрий Глуховский", 2009, true);
        Book book2 = new Book("Философия Java", "Брюс Эккель", 2015, true);
        Book book3 = new Book("Java: Полное руководство", "Герберт Шилдт", 2018,true);
        Book book4 = new Book("Анна Каренина", "Лев Толстой", 1877, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("\nСписок доступных книг:");
        library.printAvailableBooks();

        System.out.println("\nБерем книгу: ");
        book1.borrowBook();

        System.out.println("\nСписок доступных книг после изменения: ");
        library.printAvailableBooks();

        System.out.println("\nВозвращаем книгу: ");
        book1.returnBook();
        library.printAvailableBooks();

        System.out.println("\nПоиск книг по автору: ");
        List<Book> authorBooks = library.findBooksByAuthor("Дмитрий Глуховский");
        for (int i = 0; i < authorBooks.size(); i++) {
            Book book = authorBooks.get(i);
            book.displayInfo();
        }
    }
}
