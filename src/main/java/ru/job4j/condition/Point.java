package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a1 = (x2 - x1);
        double a2 = (y2 - y1);
        double first = Math.pow (a1, 2);
        double second = Math.pow (a2, 2);
        double a = first + second;
        return Math.sqrt (a);
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 0, 4, 0);
        System.out.println("result (2, 0) to (4, 0) " + result);
    }
}
