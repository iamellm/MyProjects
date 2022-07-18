package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void when2And2And3ThenExist() {
        double ab = 1;
        double ac = 2;
        double bc = 2.90;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void when3to8To2ThenExist() {
        double ab = 3;
        double ac = 8;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}