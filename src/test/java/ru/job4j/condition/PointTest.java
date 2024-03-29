package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        Assertions.assertThat(output).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void when11to20then1Dot41() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        Assertions.assertThat(output).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void whenMinus11to41then5() {
        double expected = 5;
        int x1 = - 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        Assertions.assertThat(output).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void when40to41then1() {
        double expected = 1;
        int x1 = 4;
        int y1 = 0;
        int x2 = 4;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        Assertions.assertThat(output).isEqualTo(expected, Assertions.withPrecision(0.01));
    }
}