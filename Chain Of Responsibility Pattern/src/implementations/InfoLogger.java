package implementations;

import abstractions.BaseLogger;
import enums.LoggerType;

public class InfoLogger extends BaseLogger {

  public InfoLogger(LoggerType loggerType) {
    super(loggerType);
  }

  @Override
  protected void write(String message) {
    System.out.println("Info: Logger: " + message);
  }
}
