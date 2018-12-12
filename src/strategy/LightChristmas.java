package strategy;

import javafx.scene.image.ImageView;

public class LightChristmas {
    public static void init(ImageView lightStar){
        ChristmasLight light = new Light();

        if (light.getStatus()) {
            light.performOff(lightStar);
        } else {
            light.performOn(lightStar);
        }
    }
}
