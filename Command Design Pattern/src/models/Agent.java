package models;

import interfaces.Commander;

import java.util.ArrayList;
import java.util.List;

public class Agent {
  private List<Commander> commandList = new ArrayList<>();

  public void takeCommand(Commander command) {
    this.commandList.add(command);
  }

  public void placeCommand() {
    for (Commander command : commandList) {
      command.executeCommand();
    }

    commandList.clear();
  }
}
