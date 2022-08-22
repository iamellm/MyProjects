package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int max(int a, int b, int c) {
        int max = max(a, max(b, c));
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int max = max(a, max(b, c, d));
        return max;
    }
}
