package structural.adapter;

public class MediaAdapter implements MediaPlayer
{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType)
    {
        switch (audioType)
        {
            case VLC:
                advancedMediaPlayer = new VlcPlayer();
                break;
            case MP4:
                advancedMediaPlayer = new Mp4Player();
                break;
        }
    }

    @Override
    public String play(AudioType audioType, String fileName)
    {
        switch (audioType)
        {
            case VLC:
                return advancedMediaPlayer.playVlc(fileName);
            case MP4:
                return advancedMediaPlayer.playMp4(fileName);
        }
        return null;
    }
}
