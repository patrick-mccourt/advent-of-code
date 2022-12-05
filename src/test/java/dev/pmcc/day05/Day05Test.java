package dev.pmcc.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day05Test {

  Day05 day05;

  @BeforeEach
  public void before() {
    day05 = new Day05();
  }

  @Test
  public void part1WithSmallInput() {
    String input = """
            [D]   
        [N] [C]   
        [Z] [M] [P]
         1   2   3
                
        move 1 from 2 to 1
        move 3 from 1 to 3
        move 2 from 2 to 1
        move 1 from 1 to 2""";
    assertEquals("CMZ", day05.part1(input));
  }

  @Test
  public void part1WithFullInput() {
    String input = Day05Input.input;
    assertEquals("FCVRLMVQP", day05.part1(input));
  }

  @Test
  public void part2WithSmallInput() {
    String input = """
            [D]   
        [N] [C]   
        [Z] [M] [P]
         1   2   3
                
        move 1 from 2 to 1
        move 3 from 1 to 3
        move 2 from 2 to 1
        move 1 from 1 to 2""";
    assertEquals("MCD", day05.part2(input));
  }

  @Test
  public void part2WithFullInput() {
    String input = Day05Input.input;
    assertEquals("RWLWGJGFD", day05.part2(input));
  }

}
