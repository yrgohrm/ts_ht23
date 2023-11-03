package se.yrgo;

import java.util.Date;

public class Book {
    private int id;
    private Date purchaseDate;
    private BookEdition edition;
    
    // the bad AND ugly constructor
    public Book(int id, String title, String author, String isbn) {
        this.id = id;
        this.purchaseDate = new Date();
        this.edition = new BookEdition(title, author, isbn);
    }

    // the good constructor
    public Book(int id, Date purchaseDate, BookEdition edition) {
        // ...
    }
}
