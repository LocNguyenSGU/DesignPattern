package AdapterPattern.Have_AdapterPattern;

public class AdvanceMediaPlayer {
    public void playMP3(String fileName){
        System.out.println("Playing MP3 file name: " + fileName);
    }

    public void playMP4(String fileName){
        System.out.println("Playing MP4 file name: " + fileName);
    }
}
