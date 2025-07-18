package Third;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public void displayBook() {
        System.out.println("--- Book Details ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + this.yearPublished);
    }
}
