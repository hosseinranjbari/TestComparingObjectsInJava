import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBookTest {
    @Test
    void should_sort_books() {
        Book java = new Book("Java", "11");
        Book python = new Book("Python", "12");
        Book csharp = new Book("C#", "18");
        Book cplusplus_14 = new Book("C++", "14");
        Book flutter = new Book("flutter", "16");
        Book cplusplus = new Book("c++", "13");
        Book c = new Book("c", "10");

        List<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(cplusplus_14);
        bookArrayList.add(java);
        bookArrayList.add(python);
        bookArrayList.add(csharp);
        bookArrayList.add(flutter);
        bookArrayList.add(cplusplus);
        bookArrayList.add(c);


        Collections.sort(bookArrayList);

        List<Book> expectedBookList = new ArrayList<>();
        expectedBookList.add(c);
        expectedBookList.add(csharp);
        expectedBookList.add(cplusplus);
        expectedBookList.add(cplusplus_14);
        expectedBookList.add(flutter);
        expectedBookList.add(java);
        expectedBookList.add(python);

        Assertions.assertThat(bookArrayList).isEqualTo(expectedBookList);
    }

    @Test
    void should_sort_books_by_isbn() {
        Book java = new Book("Java", "11");
        Book python = new Book("Python", "12");
        Book csharp = new Book("C#", "18");
        Book cplusplus_14 = new Book("C++", "14");
        Book flutter = new Book("flutter", "16");
        Book cplusplus = new Book("c++", "13");
        Book c = new Book("c", "10");

        List<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(cplusplus_14);
        bookArrayList.add(java);
        bookArrayList.add(python);
        bookArrayList.add(csharp);
        bookArrayList.add(flutter);
        bookArrayList.add(cplusplus);
        bookArrayList.add(c);


        Collections.sort(bookArrayList, new BookComparator());

        for (Book book : bookArrayList) {
            System.out.println(book.ISBN + " " + book.name);
        }

        List<Book> expectedBookList = new ArrayList<>();
        expectedBookList.add(c);
        expectedBookList.add(java);
        expectedBookList.add(python);
        expectedBookList.add(cplusplus);
        expectedBookList.add(cplusplus_14);
        expectedBookList.add(flutter);
        expectedBookList.add(csharp);

        Assertions.assertThat(bookArrayList).isEqualTo(expectedBookList);
    }
}
