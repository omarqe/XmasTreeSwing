/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 *
 * @author alisu
 */
public class AddGift  {
        
    public static void init(GiftBoxInterface box, Text txt, ImageView img1, ImageView img2, ImageView img3, ImageView img4) {
        
        txt.setText(String.valueOf(box.getCost()));
        if (img1.isVisible()) {
            img1.yProperty().set(95);
            img1.xProperty().set(-30);
        }
        if (img2.isVisible()) {
            img2.yProperty().set(210);
        }
        if (img3.isVisible()) {
            img3.yProperty().set(110);           
        }
        if (img4.isVisible()) {
            img4.yProperty().set(200);           
        }
        
        
        
    }
    
}
