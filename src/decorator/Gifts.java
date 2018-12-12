/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author alisu
 */
public abstract class Gifts implements GiftBoxInterface {
    
    protected GiftBoxInterface tempGiftBox;
    
    public Gifts(GiftBoxInterface newGiftBox){
        
        tempGiftBox = newGiftBox;
        
    }
    
    public String getDescription(){
    
        return tempGiftBox.getDescription();
        
    }
    
    public double getCost(){
        
        return tempGiftBox.getCost();
    
    }
}
