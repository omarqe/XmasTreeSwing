package strategy;

import javafx.scene.image.ImageView;

public class LightIsOn implements LightOnBehavior {
    public void lightOn(ImageView imageView){
        System.out.println("The light is display on the screen");
        imageView.setVisible(true);
    }
}
