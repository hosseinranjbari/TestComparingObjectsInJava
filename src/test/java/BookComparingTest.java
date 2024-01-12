import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BookComparingTest {
    @Test
    void should_equals_two_books_with_same_isbn() {
        Book cplusplus_1 = new Book("C++", "1");
        Book cplusplus_2 = new Book("C++", "1");

        Assertions.assertThat(Objects.equals(cplusplus_1, cplusplus_2)).isTrue();
        Assertions.assertThat(cplusplus_1).isEqualTo(cplusplus_2);
        Assertions.assertThat(cplusplus_1.equals(cplusplus_2)).isTrue();


    }

    @Test
    void should_compare_non_hash_collections() {
        List<Book> bookArrayList_1 = new ArrayList<>();
        bookArrayList_1.add(new Book("Java", "11"));

        List<Object> bookArrayList_2 = new ArrayList<>();
        bookArrayList_2.add(new Book("Java", "11"));

        Assertions.assertThat(Objects.equals(bookArrayList_1, bookArrayList_2)).isTrue();

    }

    @Test
    void should_compare_hash_collections() {
        Set<Book> bookHashSet_1 = new HashSet<>();
        bookHashSet_1.add(new Book("Java", "11"));

        Set<Book> bookHashSet_2 = new HashSet<>();
        bookHashSet_2.add(new Book("Java", "11"));

        Assertions.assertThat(Objects.equals(bookHashSet_1, bookHashSet_2)).isTrue();
    }
}
