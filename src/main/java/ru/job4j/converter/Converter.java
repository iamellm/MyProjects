package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 73;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;

    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.85f;
        return rsl;
    }

    public static void main(String[]  args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles is " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        euro = Converter.dollarToEuro(17);
        System.out.println("17 dollars is " + euro + " euro.");
        in = 17;
        expected = 0.85f;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("17 rubles are 0.85f. Test result : " + passed);

        float dollars = Converter.rubleToDollar(567);
        System.out.println("567 rubles is " + dollars + " dollars.");
        in = 567;
        expected = 7.76f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("567 rubles are 7.767123 Test result : " + passed);

        dollars = Converter.euroToDollar(18);
        System.out.println("18 euro is " + dollars + " dollars.");
        in = 18;
        expected = 21.06f;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("18 euro is are 21.06f. Test result : " + passed);

    }
}
