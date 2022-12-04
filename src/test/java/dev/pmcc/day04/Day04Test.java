package dev.pmcc.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04Test {

    Day04 day04;

    @BeforeEach
    public void before() {
        day04 = new Day04();
    }

    @Test
    public void part1WithSmallInput() {
        String input = """
                2-4,6-8
                2-3,4-5
                5-7,7-9
                2-8,3-7
                6-6,4-6
                2-6,4-8
                """;
        assertEquals(2, day04.part1(input));

    }
    @Test
    public void part1WithFullInput() {
        String input = Day04Input.input;
        assertEquals(518, day04.part1(input));

    }

    @Test
    public void part2WithSmallInput() {
        String input = """
                2-4,6-8
                2-3,4-5
                5-7,7-9
                2-8,3-7
                6-6,4-6
                2-6,4-8
                """;
        assertEquals(4, day04.part2(input));

    }

    @Test
    public void part2WithFullInput() {
        String input = Day04Input.input;
        assertEquals(909, day04.part2(input));

    }
}
