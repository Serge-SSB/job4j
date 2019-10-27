package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    @Test
    public void distance(){

        double in = 234;
        double in2 = 23;
        double in3 = 142;
        double in4 = 12415;
        double expected = 12392.341505;
        double out = Point.distance(in, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
