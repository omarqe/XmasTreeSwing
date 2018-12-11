package command;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

public class SantaAudio {
    private static Boolean loop = false;
    private static final String path = "./src/res/santa_voice.mp3";
    private static final Media media = new Media(new File(path).toURI().toString());
    private static final MediaPlayer audio = new MediaPlayer(media);

    public SantaAudio() {
    }

    public static void play() {
        if ( loop ) {
            audio.setOnEndOfMedia(new Runnable() {
                @Override
                public void run() {
                    audio.seek(Duration.ZERO);
                }
            });
        }

        audio.play();
    }

    public static void stop() {
        audio.stop();
    }
}
