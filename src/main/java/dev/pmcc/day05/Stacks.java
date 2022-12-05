package dev.pmcc.day05;

import java.util.ArrayList;
import java.util.List;

public class Stacks {

  private List<Stack> stacks;


  public Stacks() {
    this.stacks = new ArrayList<>();
  }


  public void moveContainer(int sourceStack, int destinationStack, int numberOfContainersToMove) {
    var from = getStackById(sourceStack);
    var to = getStackById(destinationStack);
    for(int i = 0; i < numberOfContainersToMove; i++) {
      to.addToStack(from.removeFromStack());
    }
    
  }
  public void moveContainers(int sourceStack, int destinationStack, int numberOfContainersToMove) {
    var from = getStackById(sourceStack);
    var to = getStackById(destinationStack);
    String[] containersToMove = new String[numberOfContainersToMove];
    for(int i = 0; i < numberOfContainersToMove; i++) {
      containersToMove[i] = from.removeFromStack();
    }
    for(int i = containersToMove.length-1; i >= 0; i--) {
      to.addToStack(containersToMove[i]);
    }

  }

  public List<Stack> getStacks() {
    return this.stacks;
  }

  public String getTopsOfStacks() {
    StringBuilder sb = new StringBuilder();
    for(Stack s : stacks) {
      sb.append(s.getTopOfStack());
    }
    return sb.toString();
  }
  public Stack getStackById(int id) {
    return stacks.stream().filter(s -> s.getStackId() == id).findAny().get();
  }

  public void addStack(Stack stack) {
    this.stacks.add(stack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("I have ").append(stacks.size()).append(" stacks");
    for(Stack stack : stacks) {
      sb.append("\nStack ").append(stack.getStackId()).append(" contains")
          .append(stack.toString());
    }
    return sb.toString();
  }

}
