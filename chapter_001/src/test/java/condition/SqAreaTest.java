package condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int in = 234;
        int in2 = 23;
        int expected = 207;
        double out = ru.job4j.condition.SqArea.square(in, in2);
        Assert.assertEquals(expected, out, 0.1f);
    }
}
