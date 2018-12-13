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
public class NoSnowFall implements State {
    
    ImageView snow_gif;
    Snow snow;
    
    public NoSnowFall(ImageView snow_gif, Snow snow){
        this.snow_gif = snow_gif;
        this.snow = snow;
    }

    @Override
    public void triggerSnow() {
        System.out.println("Snow has stopped !");
        snow_gif.setVisible(false);
        snow.changeState(snow.snowFall());
    }
    
}
