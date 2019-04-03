package implementations;

public class StateObserver extends Observer {

  public StateObserver(Subject subject) {
    super.subject = subject;
    super.subject.attachObserver(this);
  }

  @Override
  public void update() {
    System.out.println("State observer: " + subject.getState());
  }
}
