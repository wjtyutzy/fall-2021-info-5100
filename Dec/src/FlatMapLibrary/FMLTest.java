package FlatMapLibrary;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;

public class FMLTest {
    public static void main(String[] args) {
        Library library = new Library("Bellevue Public Library");
        library.setSections(generateSections());
        Section fiction = library.getSection("Fiction");
        addFictionBooks(fiction);
        Section science = library.getSection("Science");
        addScienceBooks(science);
        System.out.println();

        //print all books
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .forEach(book -> System.out.println(book.title));

        System.out.println("-------------");

        //print all books by writer 1
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .filter(book -> book.writer.equalsIgnoreCase("writer 1"))
                .forEach(book -> System.out.println(book.title + " writer by: " + book.writer));

        System.out.println("---------------");

        //find cheapest book
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .reduce((book1,book2) -> book1.price < book2.price ? book1 : book2)
                .ifPresent(book -> System.out.println(book.title + " writer: " + book.writer + " price:" + book.price));

        System.out.println("------------");
        //find most expensive book
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .reduce((book1,book2) -> book1.price > book2.price ? book1 : book2)
                .ifPresent(book -> System.out.println(book.title + " writer: " + book.writer + " price:" + book.price));

        System.out.println("-------------");
        //sorted by published date ascending
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .sorted((book1,book2) -> book1.getPublishedDate().compareTo(book2.getPublishedDate()))
                .forEach(book -> System.out.println(book.title + " published date:" + book.getPublishedDate()));

        System.out.println("-----------");
        //sorted by writer ascending
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .map(book -> book.getWriter())
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------");
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .limit(3)
                .forEach(System.out::println);   //print address
        System.out.println("-----------");
        library.sections.stream().flatMap(section -> section.getBooks().stream())
                .limit(3)
                .forEach(book -> System.out.print(book.title + ","));



    }//end of main


    public static ArrayList<Section> generateSections() {
        Section fiction = new Section("Fiction");
        Section nonFiction = new Section("Non Fiction");
        Section science = new Section("Science");
        Section computer = new Section("Computer");
        Section poetry = new Section("poetry");
        ArrayList<Section> list = new ArrayList<>();
        list.add(fiction);
        list.add(nonFiction);
        list.add(science);
        list.add(computer);
        list.add(poetry);
        return list;
    }


    public static void addFictionBooks(Section fiction) {
        GregorianCalendar date = new GregorianCalendar(1851, 2, 11);
        fiction.addBook(new Book("Moby Dick", "synopsis", date, "writer 1", 9.05f));
        date = new GregorianCalendar(1852,2,11);
        fiction.addBook(new Book("War and Peace", "synopsis", date, "writer 4", 7.05f));
        date = new GregorianCalendar(1853,2,11);
        fiction.addBook(new Book("Hamlet", "synopsis", date, "writer 7", 5.05f));
        date = new GregorianCalendar(1854,2,11);
        fiction.addBook(new Book("The Great Gatsby", "synopsis", date, "writer 9", 12.05f));
    }

    public static void addScienceBooks(Section science) {
        GregorianCalendar date = new GregorianCalendar(1951,2,11);
        science.addBook(new Book("Science 1", "synopsis", date, "writer 1",25.08f));
        date = new GregorianCalendar(1952,2,11);
        science.addBook(new Book("Science 2","synopsis", date, "writer 5", 6.05f));
        date = new GregorianCalendar(1953,2,11);
        science.addBook(new Book("Science 3", "synopsis", date, "writer 7", 3.05f));
        date = new GregorianCalendar(1954,2,11);
        science.addBook(new Book("Science 4", "synopsis", date, "writer 9", 16.05f));
    }

}//end of class
