package implementations;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observers;
  private int state;

  public Subject() {
    this.observers = new ArrayList<>();
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyObservers();
  }

  public void attachObserver(Observer observer){
    this.observers.add(observer);
  }

  public void notifyObservers(){
    for (Observer observer : this.observers) {
      observer.update();
    }
  }
}
