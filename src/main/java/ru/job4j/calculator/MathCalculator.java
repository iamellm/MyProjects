package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double roomAndArise(double first, double second) {
        return room(first, second) - arise(first, second);
    }

    public static double cent(double first, double second) {
        return sum(first, second) + multiply(first, second) + room(first, second) + arise(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + roomAndArise(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + cent(10, 20));
    }
}
