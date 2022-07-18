package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, in);

    }

    @Test
    public void whenConvert567RubleThen7Dot76Dollar() {
        float in = 567;
        float expected = 7.76f;
        float eps = 0.0001f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, in);
    }

    @Test
    public void whenConvert18EuroThen21Dot0Dollar() {
        float in = 18;
        float expected = 21.06f;
        float eps = 0.0001f;
        float out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out, in);
    }
}