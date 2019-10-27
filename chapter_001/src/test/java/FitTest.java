package ru.job4j.Calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight(){

        double in = 1870;
        double expected = 2035.4999577999115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
