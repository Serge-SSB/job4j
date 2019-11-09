package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(66, 4, 2,    2);
        assertThat(result, is(66));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 23, 2,    6);
        assertThat(result, is(23));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 21,    6);
        assertThat(result, is(21));
    }
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2,    6);
        assertThat(result, is(6));
    }
}
