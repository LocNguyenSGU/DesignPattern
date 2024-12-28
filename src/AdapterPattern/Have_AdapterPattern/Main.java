package AdapterPattern.Have_AdapterPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "fileName have pattern");
    }
}
