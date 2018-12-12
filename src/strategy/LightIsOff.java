package strategy;

import javafx.scene.image.ImageView;

public class LightIsOff implements LightOffBehavior{
    public void lightOff(ImageView imageView){
        System.out.println("The light is hidden from the screen");
        imageView.setVisible(false);
    }
}
