package command;

import javafx.scene.image.ImageView;

public class RemoteLoader {
    public static void init(ImageView santaImage) {
        RemoteControl remote = new RemoteControl();
        Santa santa = new Santa();
        SantaOnCommand santaOn = new SantaOnCommand(santa);
        SantaOffCommand santaOff = new SantaOffCommand(santa);

        remote.setCommand(santa.getStatus() ? santaOff : santaOn);
        remote.buttonPressed(santaImage);
    }
}
