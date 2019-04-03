package abstractions;

import enums.LoggerType;

public abstract class BaseLogger {

  private LoggerType loggerType;
  private BaseLogger nextLogger;

  public BaseLogger(LoggerType loggerType) {
    this.loggerType = loggerType;
  }

  public void setNextLogger(BaseLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void logMessage(LoggerType loggerType, String message) {
    if (this.loggerType == loggerType) {
      write(message);
    }

    if (this.nextLogger != null) {
      this.nextLogger.logMessage(loggerType, message);
    }
  }

  abstract protected void write(String message);
}
