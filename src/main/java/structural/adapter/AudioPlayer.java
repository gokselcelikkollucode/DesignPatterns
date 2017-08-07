package structural.adapter;

public class AudioPlayer implements MediaPlayer
{
    private MediaAdapter mediaAdapter;

    @Override
    public String play(AudioType audioType, String fileName)
    {
        //inbuilt support to play mp3 music files
        switch (audioType)
        {
            case MP3:
                return "Playing mp3 file. Name: " + fileName;
            default:
                mediaAdapter = new MediaAdapter(audioType);
                return mediaAdapter.play(audioType, fileName);
        }
    }
}
