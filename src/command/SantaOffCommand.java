package command;

import javafx.scene.image.ImageView;

public class SantaOffCommand implements Command {
    Santa santa;

    public SantaOffCommand(Santa santa) {
        this.santa = santa;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        santa.off();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        santa.off(imageView);
    }
}
