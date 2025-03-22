import java.util.Objects;

public class Book {

    private String name;
    private Author author;
    private int yearOfPublication;

    public Book (String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    public String toString() {
        return author +  ", " + name + ", " + yearOfPublication;
    }

    @Override
    public boolean equals(Object ob) {
        Book book = (Book) ob;
        return this.name.equals(book.name) && this.author.equals(book.author) && this.yearOfPublication == book.yearOfPublication;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author, yearOfPublication);
    }
}
