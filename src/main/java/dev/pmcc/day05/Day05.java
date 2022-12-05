package dev.pmcc.day05;

import java.util.ArrayList;
import java.util.List;

public class Day05 {

  public String part1(String input) {
    StringBuilder sb = new StringBuilder();
    String[] things = input.split("\n\n");
    var stacks = createStacks(things[0]);
    List<Move> moves = new ArrayList<>();
    for (String s : things[1].split("\n")) {
      moves.add(new Move(s));
    }
    for(Move move : moves) {
      stacks.moveContainer(move.sourceStack, move.destinationStack, move.numberOfContainersToMove);
    }
    sb.append(stacks. getTopsOfStacks());
    return sb.toString();
  }

  public String part2(String input) {
    StringBuilder sb = new StringBuilder();
    String[] things = input.split("\n\n");
    var stacks = createStacks(things[0]);
    List<Move> moves = new ArrayList<>();
    for (String s : things[1].split("\n")) {
      moves.add(new Move(s));
    }
    for(Move move : moves) {
      stacks.moveContainers(move.sourceStack, move.destinationStack, move.numberOfContainersToMove);
    }
    sb.append(stacks. getTopsOfStacks());
    return sb.toString();
  }

  public Stacks createStacks(String stackInput) {
    /*
          [D]
      [N] [C]
      [Z] [M] [P]
       1   2   3  input looks like this
     */
    var stacks = new Stacks();
    String[] stackRows = stackInput.split("\n");
    String lastRow = stackRows[stackRows.length - 1];

    for (String stackId : lastRow.split("  ")) {
      var id = Integer.parseInt(stackId.trim());
      Stack stack = new Stack(id);
      stacks.addStack(stack);
    }
    //loop through every row except the last row
    int stackOffset = 4;
    int containerIndex = 1;
    for(Stack stack : stacks.getStacks()) {
      for (int i = stackRows.length - 2; i >= 0; i--) {
        try {
          var container = stackRows[i].toCharArray()[containerIndex];
          if(!(container == ' ')){
            stack.addToStack(String.valueOf(container));
          }
        } catch (IndexOutOfBoundsException ioobe) {
          System.out.println("No container there");
        }
      }
      containerIndex+=stackOffset;
    }

    return stacks;
  }
}


