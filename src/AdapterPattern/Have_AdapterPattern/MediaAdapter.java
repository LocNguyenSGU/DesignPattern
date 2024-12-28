package AdapterPattern.Have_AdapterPattern;

public class MediaAdapter implements MediaPlayer{
    private AdvanceMediaPlayer advanceMediaPlayer;

    MediaAdapter(String type) {
        if(type.equals("MP3")) {
            advanceMediaPlayer = new AdvanceMediaPlayer();
        } else if (type.equals("MP4")) {
            advanceMediaPlayer = new AdvanceMediaPlayer();
        }
    }
    @Override
    public void play(String type, String fileName) {
       if(type.equals("MP3")){
           advanceMediaPlayer.playMP3(fileName);
        } else if (type.equals("MP4")) {
           advanceMediaPlayer.playMP4(fileName);
       }
    }
}
