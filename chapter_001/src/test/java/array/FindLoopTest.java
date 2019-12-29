package array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas23henNan() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 24, 54, 21};
        int value = 23;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas300Then8() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 24, 54, 21, 525, -300};
        int value = -300;
        int result = find.indexOf(input, value);
        int expect = 7;
        assertThat(result, is(expect));
    }
}