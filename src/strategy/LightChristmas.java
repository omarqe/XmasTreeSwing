package strategy;

import javafx.scene.image.ImageView;

public class LightChristmas {
    public static void init(ImageView lightStar){
        ChristmasLight light = new Light();
        light.performOn(lightStar);
        light.performOff(lightStar);
    }
}
