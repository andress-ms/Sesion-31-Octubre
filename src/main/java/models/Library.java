package models;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book:" + book + "to the library");
    }

    public void deleteBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Removed book:" + book + "from the library");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void showBooks(){
        if (books.isEmpty()) {
            System.out.println("No books found");
        } else {
            System.out.println("Available books:");
            for (Book book : books) {
                System.out.println("-" + book);
            }
        }
    }
}
