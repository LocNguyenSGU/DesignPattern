package AdapterPattern.Have_AdapterPattern;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String fileName) {
        if(type.equals("MP3") || type.equals("MP4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        }else {
            System.out.println("Type is not valid.");
        }
    }
}
