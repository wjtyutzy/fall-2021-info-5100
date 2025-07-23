package FlatMapLibrary;

import java.util.GregorianCalendar;

public class Book {
    String title;
    String synopsis;
    GregorianCalendar publishedDate;
    String writer;
    float price;
    int rating;

    public Book(String title, String synopsis, GregorianCalendar publishedDate, String writer, float price) {
        this.title = title;
        this.synopsis = synopsis;
        this.publishedDate = publishedDate;
        this.writer = writer;
        this.price = price;
        this.rating = -1;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public float getPrice() {
        return price;
    }

    public GregorianCalendar getPublishedDate() {
        return publishedDate;
    }
}
