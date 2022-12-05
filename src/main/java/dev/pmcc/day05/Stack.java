package dev.pmcc.day05;

import java.util.ArrayList;
import java.util.List;

public class Stack {

  private List<String> containers;

  private int stackId;

  public Stack(int stackId) {
    this.stackId = stackId;
    this.containers = new ArrayList<>();
  }

  public String getTopOfStack() {
    return containers.get(containers.size()-1);
  }

  public String removeFromStack() {
    return containers.remove(containers.size()-1);
  }

  public void addToStack(String container) {
    containers.add(container);
  }


  public int getStackId() {
    return stackId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(String container : containers) {
      sb.append(container).append(" ");
    }
    return sb.toString();
  }
}
