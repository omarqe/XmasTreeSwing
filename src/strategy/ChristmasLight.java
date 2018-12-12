package strategy;

import javafx.scene.image.ImageView;

public abstract class ChristmasLight {
    LightOnBehavior lightOnBehavior;
    LightOffBehavior lightOffBehavior;
    
    public ChristmasLight(){
        
    }
    
    public abstract void display();
    
    public void performOn(ImageView imageView){
        lightOnBehavior.lightOn(imageView);
    }
    
    public void performOff(ImageView imageView){
        lightOffBehavior.lightOff(imageView);
    }
    
    public void setLightOnBehavior(LightOnBehavior lob){
        lightOnBehavior = lob;
    }
    
    public void setLightOffBehavior(LightOffBehavior lob){
        lightOffBehavior = lob;
    }
}
