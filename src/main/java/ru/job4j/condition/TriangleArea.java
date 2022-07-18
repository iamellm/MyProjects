package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double four = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return four;
    }

    public static void main(String[] args) {
        double four = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + four);
    }
}
