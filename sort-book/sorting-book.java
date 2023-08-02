import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters (Optional, but useful for accessing private variables)

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Kitapları isme göre sıralamak için TreeSet kullanalım.
        Set<Book> bookSetByName = new TreeSet<>();

        bookSetByName.add(new Book("Java Programming", 450, "John Doe", "2022-01-01"));
        bookSetByName.add(new Book("Introduction to Algorithms", 800, "Thomas Cormen", "2020-05-15"));
        bookSetByName.add(new Book("Artificial Intelligence", 600, "Jane Smith", "2023-03-10"));
        bookSetByName.add(new Book("Database Management", 350, "Alice Johnson", "2021-09-30"));
        bookSetByName.add(new Book("Operating Systems", 500, "Bob Williams", "2022-11-20"));

        System.out.println("Kitaplar isme göre sıralandı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralamak için TreeSet'e yeni bir Comparator ekleyelim.
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));

        bookSetByPageCount.add(new Book("Java Programming", 450, "John Doe", "2022-01-01"));
        bookSetByPageCount.add(new Book("Introduction to Algorithms", 800, "Thomas Cormen", "2020-05-15"));
        bookSetByPageCount.add(new Book("Artificial Intelligence", 600, "Jane Smith", "2023-03-10"));
        bookSetByPageCount.add(new Book("Database Management", 350, "Alice Johnson", "2021-09-30"));
        bookSetByPageCount.add(new Book("Operating Systems", 500, "Bob Williams", "2022-11-20"));

        System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
