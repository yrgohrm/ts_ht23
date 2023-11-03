package se.yrgo;

public class BookManager {
    public static void purchasePopularBooks() {
        Date date = new Date();
        BookEdition be = new BookEdition("apa", "bepa", "234567890X");
        Book theBook = new Book(1234, date, be);

        
    }
}
