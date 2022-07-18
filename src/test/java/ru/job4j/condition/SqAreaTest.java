package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP21K5Square15Dot31() {
        double expected = 15.31f;
        int p = 21;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 00.1);
    }

    @Test
    public void whenP4K4Square0dot64() {
        double expected = 0.64f;
        int p = 4;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 00.1);
    }

}