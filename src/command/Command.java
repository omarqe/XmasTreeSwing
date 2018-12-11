package command;

import javafx.scene.image.ImageView;

public interface Command {
    public void execute();
    public void execute(ImageView imageView);
}
