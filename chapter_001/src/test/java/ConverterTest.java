package ru.job4j.Converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Calculator.Converter;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(in); // привел тип к int, т.к. в моем конверторе тип данных float
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        float in =140;
        float expected = 2.3333333f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.0f);  //как понял сравнение float|float и double/double без дельты не работают
    }
    @Test
    public void euroToRuble() {
        float in = 12.4f;
        float expected = 868;
        float out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out,0.0f);
    }
    @Test
    public void dollarToRuble() {
        int in =23;
        int expected = 1380;
        int out = (int) Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}