package generics.part3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SortedPairTest {

    @Test
    public void shouldRetainOrderOfOrderedPair() {
        SortedPair<String> test = new SortedPair<>("b", "a");

        assertThat("a", is(test.getFirst()));
        assertThat("b", is(test.getSecond()));
    }

    @Test
    public void shouldFlipOrderOfMisOrderedPair() {
        SortedPair<Integer> test = new SortedPair<>(2, 1);

        assertThat(1, is(test.getFirst()));
        assertThat(2, is(test.getSecond()));

    }

}
