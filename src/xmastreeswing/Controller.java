package xmastreeswing;

import command.RemoteLoader;
import javafx.fxml.FXML;;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import strategy.LightChristmas;

public class Controller {
    @FXML
    private Button santa, snow, ornaments, lights, gifts;

    @FXML
    private ImageView santaImage;
    
    @FXML
    private ImageView lightStar;

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
                LightChristmas.init(lightStar);
                break;

            // TODO: Decorator Pattern
            case "gifts":
                break;
        }
    }
}
