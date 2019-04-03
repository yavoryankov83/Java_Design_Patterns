import abstractions.BaseLogger;
import enums.LoggerType;
import implementations.ErrorLogger;
import implementations.InfoLogger;

public class Main {

  private static BaseLogger getChainOfLoggers() {
    BaseLogger errorLoger = new ErrorLogger(LoggerType.ERROR);
    BaseLogger infoLogger = new InfoLogger(LoggerType.INFO);

    errorLoger.setNextLogger(infoLogger);

    return errorLoger;
  }

  public static void main(String[] args) {
    BaseLogger chainOfLoggers = getChainOfLoggers();

    chainOfLoggers.logMessage(LoggerType.ERROR, "This is Error log");
    chainOfLoggers.logMessage(LoggerType.INFO, "This is Info log");
  }
}
