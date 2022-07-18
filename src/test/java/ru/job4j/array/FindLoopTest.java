package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then1() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind10() {
        int[] data = new int[]{3, 5, 15, 21, 5, 7};
        int el = 7;
        int start = 2;
        int finish = 21;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind4() {
        int[] data = new int[]{3, 5, 2, 7, 12};
        int el = 12;
        int start = 1;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);

    }
}