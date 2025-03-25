package OOP;

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void bookDetail() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + "$" + price);
    }

    void bookDiscount() {
        System.out.println("Book Discount: " + "$" + (price * 0.1));
    }

}

public class practice {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 50);
        Book book2 = new Book("Python Basics", "Jane Smith", 45);
        book1.bookDetail();
        book1.bookDiscount();
        System.out.println();
        book2.bookDetail();
        book2.bookDiscount();

    }
}
