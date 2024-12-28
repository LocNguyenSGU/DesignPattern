package AdapterPattern.None_AdapterPattern;

public class AudioPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer = new AdvanceMediaPlayer();

    public void play(String type, String fileName) {
        if(type.equals("MP3")) {
            advanceMediaPlayer.playMP3(fileName);
        } else if (type.equals("MP4")) {
            advanceMediaPlayer.playMP4(fileName);
        }
    }

}
