package dev.pmcc.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day01Test {

    Day01 day01;

    @BeforeEach
    public void before() {
        day01 = new Day01();
    }

    String sample = """
            1000
            2000
            3000
                        
            4000
                        
            5000
            6000
                        
            7000
            8000
            9000
                        
            10000
            """;

    @Test
    public void part01WithSmallInput() {
        assertEquals(24000, day01.part1(sample));
    }
    @Test
    public void part01WithFullInput() {
        assertEquals(66616, day01.part1(Day01Input.day01Full));
    }

    @Test
    public void part02WithSmallInput() {
        assertEquals(45000, day01.part2(sample));
    }

    @Test
    public void part02WithFullInput() {
        assertEquals(199172, day01.part2(Day01Input.day01Full));
    }
}
