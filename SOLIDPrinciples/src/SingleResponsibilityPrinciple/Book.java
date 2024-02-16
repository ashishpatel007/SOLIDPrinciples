package SingleResponsibilityPrinciple;

/**
 * The Single Responsibility Principle
 * https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/
 *
 * Simple bookstore invoice program
 * Author: Ashish
 * Date: February 15, 2024
 */
class Book {

    String name;
    String authorName;
    int year;
    int price;
    String isbn;

    public Book(String name, String authorName, int year, int price, String isbn)
    {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

}
