package ru.job4j.array;


import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5To8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 8;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 9, 7, 8, 6};
        Assert.assertArrayEquals(expected, result);
    }

}