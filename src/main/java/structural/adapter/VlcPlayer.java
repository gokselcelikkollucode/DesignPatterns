package structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer
{

    @Override
    public String playVlc(String fileName)
    {
        return "Playing vlc file. Name: " + fileName;
    }

    @Override
    public String playMp4(String fileName)
    {
        //do nothing
        return null;
    }
}
