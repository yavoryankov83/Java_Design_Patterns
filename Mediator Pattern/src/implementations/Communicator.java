package implementations;

public class Communicator {

  public static void showCommunication(Radio radio, String melody) {
    System.out.println("Song name: " + radio.getSongName() + " melody: " + melody);
  }
}
