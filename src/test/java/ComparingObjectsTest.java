import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ComparingObjectsTest {
    @Test
    void should_compare_primitive_objects() {
        int a = 1;
        int b = 1;

        Assertions.assertThat(a == b).isTrue();
    }

    @Test
    void should_compare_non_primitive_objects() {
        String a = "Java";
        String b = "Java";

        String javaOne = new String("Java");
        String javaTwo = new String("Java");

        Assertions.assertThat(a == b).isTrue();
        Assertions.assertThat(javaOne == javaTwo).isFalse();
        Assertions.assertThat(javaOne.equals(javaTwo)).isTrue();
    }

    @Test
    void should_handle_null_pointer_exception_for_comparing_non_primitive_objects() {
        String a = new String("Java");
        String b = null;

        Assertions.assertThat(Objects.equals(a, b)).isFalse();
    }
}
