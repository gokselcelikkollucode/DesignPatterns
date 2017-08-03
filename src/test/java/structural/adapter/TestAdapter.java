package structural.adapter;

import static org.assertj.core.api.Assertions.assertThat;
import static structural.adapter.AudioType.*;

import org.junit.Test;

public class TestAdapter
{
    AudioPlayer audioPlayer = new AudioPlayer();

    @Test
    public void testMp3()
    {
        assertThat(audioPlayer.play(MP3, "beyond_the_horizon.mp3")).isEqualTo("Playing mp3 file. Name: beyond_the_horizon.mp3");
    }

    @Test
    public void testMp4()
    {
        assertThat(audioPlayer.play(MP4, "alone.mp4")).isEqualTo("Playing mp4 file. Name: alone.mp4");
    }

    @Test
    public void testVlc()
    {
        assertThat(audioPlayer.play(VLC, "far_far_away.vlc")).isEqualTo("Playing vlc file. Name: far_far_away.vlc");
    }
}
