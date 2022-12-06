package dev.pmcc.day06;

import dev.pmcc.Template;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Day06 implements Template {

  @Override
  public int part1(String input) {
    int firstIndexAfterMarker = 0;
    var letters = input.toCharArray();
    Queue<Character> lastFour = new LinkedList<>();
    for(int i = 0; i < letters.length; i++) {
      if(lastFour.size() > 3) {
        lastFour.remove();
      }
      lastFour.add(letters[i]);
      if(lastFour.size() == 4 && lettersAreUnique(lastFour, 4)) {
        firstIndexAfterMarker = i + 1;
        break;
      }
    }
    return firstIndexAfterMarker;
  }

  private boolean lettersAreUnique(Queue<Character> lastFour, int expectedLength) {
    Set<Character> unique = new HashSet<>();
    unique.addAll(lastFour);
    return unique.size() == expectedLength;
  }

  @Override
  public int part2(String input) {
    int firstIndexAfterMessage = 0;
    var letters = input.toCharArray();
    Queue<Character> lastFourteen = new LinkedList<>();
    for(int i = 0; i < letters.length; i++) {
      if(lastFourteen.size() > 13) {
        lastFourteen.remove();
      }
      lastFourteen.add(letters[i]);
      if(lastFourteen.size() == 14 && lettersAreUnique(lastFourteen, 14)) {
        firstIndexAfterMessage = i + 1;
        break;
      }
    }
    return firstIndexAfterMessage;
  }
}
