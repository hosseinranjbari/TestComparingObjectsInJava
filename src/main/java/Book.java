import java.util.Objects;

public class Book implements Comparable<Book>{
    String name;
    String ISBN;

    public Book(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public int compareTo(Book otherBook) {
        int compareNameInteger = this.name.compareToIgnoreCase(otherBook.name);
        if (compareNameInteger == 0) {
            return this.ISBN.compareTo(otherBook.ISBN);
        }
        return compareNameInteger;
    }
}
