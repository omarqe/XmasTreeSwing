package strategy;

import javafx.scene.image.ImageView;

public abstract class ChristmasLight {
    private static Boolean status = false;
    LightOnBehavior lightOnBehavior;
    LightOffBehavior lightOffBehavior;
    
    public ChristmasLight(){
        
    }
    
    public abstract void display();
    
    public void performOn(ImageView imageView){
        this.status = true;
        lightOnBehavior.lightOn(imageView);
    }

    public static Boolean getStatus() {
        return status;
    }

    public void performOff(ImageView imageView){
        this.status = false;
        lightOffBehavior.lightOff(imageView);
    }
    
    public void setLightOnBehavior(LightOnBehavior lob){
        lightOnBehavior = lob;
    }
    
    public void setLightOffBehavior(LightOffBehavior lob){
        lightOffBehavior = lob;
    }
}
