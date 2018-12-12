package strategy;

import javafx.scene.image.ImageView;

public class LightIsOff implements LightOffBehavior{
    private static Boolean status = true;
    public void lightOff(ImageView imageView){
        status = false;
        System.out.println("The light is hidden from the screen");
        imageView.setVisible(false);
    }
}
