package command;

import javafx.scene.image.ImageView;

public class SantaOnCommand implements Command {
    Santa santa;

    public SantaOnCommand(Santa santa) {
        this.santa = santa;
    }

    @Override
    public void execute() {
        // Display Santa Claus on the GUI
        santa.on();
    }

    @Override
    public void execute(ImageView imageView) {
        // Display Santa Claus on the GUI
        santa.on(imageView);
    }
}
