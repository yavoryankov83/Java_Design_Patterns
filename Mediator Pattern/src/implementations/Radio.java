package implementations;

public class Radio {

  private String songName;

  public Radio(String songName) {
    this.songName = songName;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public void singSong(String melody) {
    Communicator.showCommunication(this, melody);
  }
}
