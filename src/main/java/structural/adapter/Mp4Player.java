package structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer
{
    @Override
    public String playVlc(String fileName)
    {
        //do nothing
        return null;
    }

    @Override
    public String playMp4(String fileName)
    {
        return "Playing mp4 file. Name: " + fileName;
    }
}
