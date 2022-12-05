package dev.pmcc.day05;

public class Move {

  int numberOfContainersToMove;
  int sourceStack;
  int destinationStack;

  public Move(String move) {
    /*
      move 1 from 2 to 1
     */
    String[] things = move.split(" ");
    this.numberOfContainersToMove = Integer.parseInt(things[1]);
    this.sourceStack = Integer.parseInt(things[3]);
    this.destinationStack = Integer.parseInt(things[5]);

  }

  public String toString() {
    return "move " + numberOfContainersToMove + " containers " + sourceStack + " to " + destinationStack;
  }

}
