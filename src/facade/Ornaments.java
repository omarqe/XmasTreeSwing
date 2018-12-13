/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javafx.scene.image.ImageView;
/**
 *
 * @author user
 */
public class Ornaments
{
    ImageView orn1, orn2, orn3, orn4, orn5;
    static boolean showorn=false;
    
    public Ornaments(ImageView orn1, ImageView orn2, ImageView orn3, ImageView orn4, ImageView orn5)
    {
        this.orn1=orn1;
        this.orn2=orn2;
        this.orn3=orn3;
        this.orn4=orn4;
        this.orn5=orn5;
    }
    
    public void setOrn()
    {
        if(showorn)
        {
            orn1.setVisible(false);
            orn2.setVisible(false);
            orn3.setVisible(false);
            orn4.setVisible(false);
            orn5.setVisible(false);
            showorn=false;
        }
        else
        {
            orn1.setVisible(true);
            orn2.setVisible(true);
            orn3.setVisible(true);
            orn4.setVisible(true);
            orn5.setVisible(true);
            showorn=true;
        }
    }
    
    
}
