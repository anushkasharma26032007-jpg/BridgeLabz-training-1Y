package Storybasedproblem;
class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "Central Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {

    TextBook(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {

    Magazine(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class LibraryTest {

    public static void main(String[] args) {

        Book b1 = new TextBook(1,"Java Programming",500);
        Book b2 = new Magazine(2,"Tech Monthly",100);

        System.out.println("Fine for TextBook: "+b1.calculateFine(3));
        System.out.println("Fine for Magazine: "+b2.calculateFine(3));
    }
}
