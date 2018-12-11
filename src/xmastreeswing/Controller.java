package xmastreeswing;

import command.RemoteLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Button santa, snow, ornaments, lights, gifts;

    @FXML
    private ImageView santaImage;

    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch ( id ){
            case "santa":
                RemoteLoader.init(santaImage);
                break;

            // TODO: State Pattern
            case "snow":
                break;

            // TODO: Façade Pattern
            case "ornaments":
                break;

            // TODO: Strategy Pattern
            case "lights":
                break;

            // TODO: Decorator Pattern
            case "gifts":
                break;
        }
    }
}
