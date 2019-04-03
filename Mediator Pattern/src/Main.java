import implementations.Communicator;
import implementations.Radio;

public class Main {

  public static void main(String[] args) {
    Radio radio1 = new Radio("Always - Bon Jovi");
    Radio radio2 = new Radio("Next Episode - Dr. Dre");

    radio1.singSong("I will always love you");
    radio2.singSong("Ara gara ga");


  }
}
