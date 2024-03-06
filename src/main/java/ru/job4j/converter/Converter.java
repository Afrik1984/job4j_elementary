package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToEuro(float value) {
        return value * 0.85f;
    }
    public static float euroToDollar(float value) {
        return value * 1.17f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println(Converter.dollarToEuro(15));
        System.out.println(Converter.euroToDollar(17));
        }
}
