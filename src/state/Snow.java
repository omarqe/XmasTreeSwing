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
public class Snow {
    
    private State snowFall;
    private State noSnowFall;
    private State state;
    ImageView gif;
    
    public Snow(ImageView gif){
        this.gif = gif;
        snowFall = new SnowFall(gif, this);
        noSnowFall = new NoSnowFall(gif, this);
        state = snowFall;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void changeState(State state){
        this.state = state;
    }
    
    public void triggerSnow(){
        state.triggerSnow();
    }
    
    public State snowFall(){
        return snowFall;
    }
    
    public State NoSnowFall(){
        return noSnowFall;
    }
}
