package strategy;

import javafx.scene.image.ImageView;

public class LightIsOn implements LightOnBehavior {
    private static Boolean status = false;
    public void lightOn(ImageView imageView){
        status = true;
        System.out.println("The light is display on the screen");
        imageView.setVisible(true);
    }
}
