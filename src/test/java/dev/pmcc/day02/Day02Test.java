package dev.pmcc.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day02Test {

    Day02 day02;

    @BeforeEach
    public void before() {
        day02 = new Day02();
    }

    @Test
    public void part01WithSmallInput() {
        String input = """
                A Y
                B X
                C Z
                """;

        assertEquals(15, day02.part1(input));
    }

    @Test
    public void part01WithFullInput() {
        String input = Day02Input.input;
        assertEquals(14297, day02.part1(input));
    }

    @Test
    public void part02WithSmallInput() {
        String input = """
                A Y
                B X
                C Z
                """;

        assertEquals(12, day02.part2(input));
    }

    @Test
    public void part02WithFullInput() {
        String input = Day02Input.input;
        assertEquals(12, day02.part2(input));
    }
}
