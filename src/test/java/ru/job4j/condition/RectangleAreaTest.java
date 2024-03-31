package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.withPrecision;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double output = RectangleArea.square(p, k);
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K3Square0dot75() {
        double expected = 0.75;
        double p = 4;
        double k = 3;
        double output = RectangleArea.square(p, k);
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}