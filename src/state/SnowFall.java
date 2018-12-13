/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javafx.scene.image.ImageView;

/**
 *
 * @author Irsyad
 */
public class SnowFall implements State{
    
    ImageView snow_gif;
    
    private final Snow snow;
    
    public SnowFall(ImageView snow_gif, Snow snow){
        this.snow_gif = snow_gif;
        this.snow = snow;
    }

    @Override
    public void triggerSnow() {
        System.out.println("Snow is falling !");
        snow_gif.setVisible(true);
        snow.changeState(snow.NoSnowFall());
    }
    
}
