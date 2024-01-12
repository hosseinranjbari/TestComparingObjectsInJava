import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class BookComparingTest {
    @Test
    void should_equals_two_books_with_same_isbn() {
        Book cplusplus_1 = new Book("C++", "1");
        Book cplusplus_2 = new Book("C++", "1");

        Assertions.assertThat(Objects.equals(cplusplus_1, cplusplus_2)).isTrue();
        Assertions.assertThat(cplusplus_1).isEqualTo(cplusplus_2);
        Assertions.assertThat(cplusplus_1.equals(cplusplus_2)).isTrue();


    }
}
