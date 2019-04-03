package implementations;

import abstractions.BaseLogger;
import enums.LoggerType;

public class ErrorLogger extends BaseLogger {

  public ErrorLogger(LoggerType loggerType) {
    super(loggerType);
  }

  @Override
  protected void write(String message) {
    System.out.println("Error: Logger: " + message);
  }
}
