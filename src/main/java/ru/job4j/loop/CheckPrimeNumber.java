package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result;
        if (number != 1) {
            result = true;
            for (int index = number - 1; index > 1; index--) {
                if (number % index == 0) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}