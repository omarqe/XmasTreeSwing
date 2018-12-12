
package strategy;

public class Light extends ChristmasLight {
    public Light(){
        lightOnBehavior = new LightIsOn();
        lightOffBehavior = new LightIsOff();
    }
    
    public void display(){
        System.out.println("Light button is pushed");
    }
}
