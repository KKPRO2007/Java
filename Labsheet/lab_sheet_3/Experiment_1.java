package lab_sheet_3;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        if (title == null || author == null || price <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Experiment_1 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "John Doe", 450.50);
        b.displayDetails();
    }
}
