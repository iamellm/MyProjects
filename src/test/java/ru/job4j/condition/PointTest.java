package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to10then2() {
        double expected = 2;
        Point a = new Point(1, 2);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to40then3() {
        double expected = 3;
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when20To40To40Then6() {
        double exp = 6;
        Point a = new Point(2, 4, 4);
        Point b = new Point(0, 0, 0);
        double rsl = a.distance3d(b);
        Assert.assertEquals(exp, rsl, 0.01);
    }

    @Test
    public void when22To42To33Then2() {
        double exp = 2;
        Point a = new Point(2, 4, 3);
        Point b = new Point(2, 2, 3);
        double rsl = a.distance3d(b);
        Assert.assertEquals(exp, rsl, 0.01);
    }
}