package implementations;

import interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

  private List<Command> commands;

  public Dealer() {
    this.commands = new ArrayList<>();
  }

  public void takeCommand(Command command) {
    commands.add(command);
  }

  public void executeCommands() {
    for (Command currentCommand : this.commands) {
      currentCommand.execute();
    }

    commands.clear();
  }
}
