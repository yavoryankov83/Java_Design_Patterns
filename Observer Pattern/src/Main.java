import implementations.StateObserver;
import implementations.Subject;

public class Main {

  public static void main(String[] args) {
    Subject subject = new Subject();

    new StateObserver(subject);
    subject.setState(25);
  }
}
