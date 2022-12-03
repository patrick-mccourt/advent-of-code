package dev.pmcc.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {
    Day03 day03;

    @BeforeEach
    public void before() {
        day03 = new Day03();
    }

    @Test
    public void part1WithSmallInput() {
        String input = """
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """;
        assertEquals(157, day03.part1(input));
    }

    @Test
    public void part1WithFullInput() {
        String input = Day03Input.input;
        assertEquals(7727, day03.part1(input));
    }

    @ParameterizedTest(name = "{index} => ch={0}, expected={1}")
    @CsvFileSource(resources = "/test-data.csv")
    void convertCharToIntTest(char ch, int expected) {
        assertEquals(expected, Day03.convertCharToInt(ch));
    }

    @Test
    public void part2WithSmallInput() {
        String input = """
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """;
        assertEquals(70, day03.part2(input));
    }

    @Test
    public void part2WithFullInput() {
        String input = Day03Input.input;
        assertEquals(2609, day03.part2(input));
    }
}
