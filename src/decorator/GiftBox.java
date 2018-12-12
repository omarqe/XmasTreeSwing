/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import xmastreeswing.XmasTreeSwing;

/**
 *
 * @author alisu
 */
public class GiftBox implements GiftBoxInterface{
       
    @Override
    public String getDescription() {
        return "Christmas Tree Gifts: ";
    }

    @Override
    public double getCost() {
        return 20.00;
    }

    @Override
    public void setImage(ImageView imageView) {
    }

    
}
