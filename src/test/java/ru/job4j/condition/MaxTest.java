package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int a = 2;
        int b = 1;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int a = 2;
        int b = 1;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int a = 1;
        int b = 1;
        int result = Max.max(a, b);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To6To9Then9() {
        int a = 4;
        int b = 6;
        int c = 9;
        int rsl = Max.max(a, b, c);
        int exp = 9;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenMaxNegative5ToNegative7ToNegative2ThenNegative2() {
        int a = -5;
        int b = -7;
        int c = -2;
        int rsl = Max.max(a, b, c);
        int exp = -2;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int rsl = Max.max(a, b, c, d);
        int exp = 4;
        Assert.assertEquals(rsl, exp);
    }

    @Test
    public void whenMax3To2To3To1Then3() {
        int a = 3;
        int b = 2;
        int c = 1;
        int d = 3;
        int rsl = Max.max(a, b, c, d);
        int exp = 3;
        Assert.assertEquals(rsl, exp);
    }
}