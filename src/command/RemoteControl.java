package command;

import javafx.scene.image.ImageView;

public class RemoteControl {
    Command slot;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }

    public void buttonPressed(ImageView imageView) {
        slot.execute(imageView);
    }
}
