package dev.pmcc.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Day06Test {

  Day06 day06;

  @BeforeEach
  public void before() {
    day06 = new Day06();
  }

  @ParameterizedTest(name = "{index} => encodedString={0}, expected={1}")
  @CsvFileSource(resources = "/day06-part1.csv")
  public void part1WithSmallInput(String encodedString, int expected){
    assertEquals(expected, day06.part1(encodedString));
  }

  @Test
  public void part1WithFullInput(){
    assertEquals(1134, day06.part1(Day06Input.input));
  }

  @ParameterizedTest(name = "{index} => encodedString={0}, expected={1}")
  @CsvFileSource(resources = "/day06-part2.csv")
  public void part2WithSmallInput(String encodedString, int expected){
    assertEquals(expected, day06.part2(encodedString));
  }

  @Test
  public void part2WithFullInput(){
    assertEquals(2263, day06.part2(Day06Input.input));
  }

}
