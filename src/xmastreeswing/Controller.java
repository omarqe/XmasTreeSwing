package xmastreeswing;

import command.RemoteLoader;
import decorator.AddGift;
import decorator.Candy;
import decorator.GiftBox;
import decorator.GiftBoxInterface;
import decorator.Gifts;
import decorator.Smartphone;
import decorator.Toy;
import decorator.tshirt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.LightChristmas;

public class Controller {
    GiftBoxInterface box = new GiftBox();

    @FXML
    private Button santa, snow, ornaments, lights, gifts;

    @FXML
    private ImageView santaImage;
    
    @FXML
    private ImageView lightStar;

    @FXML
    private ImageView bearImage, tshirtImage, smartphoneImage, candyImage;
    
    @FXML
    private RadioButton teddyBear, tshirt, smartphone, candy;
    
    @FXML
    private Text price;
    
    @FXML
    private Button adder;
    
    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch ( id ){
            case "santa":
                RemoteLoader.init(santaImage);
                break;

            // TODO: State Pattern
            case "snow":
                break;

            // TODO: Façade Pattern
            case "ornaments":
                break;

            // TODO: Strategy Pattern
            case "lights":
                LightChristmas.init(lightStar);
                break;

            // TODO: Decorator Pattern
            case "gifts":
                AddGift.init(box,price,bearImage,tshirtImage,candyImage,smartphoneImage);
                break;
        }
    }
    
    @FXML
    public void clearGifts(ActionEvent e){
        tshirt.setSelected(false);
        candy.setSelected(false);
        smartphone.setSelected(false);
        teddyBear.setSelected(false);
        tshirtImage.setVisible(false);
        bearImage.setVisible(false);
        smartphoneImage.setVisible(false);
        candyImage.setVisible(false);
        tshirtImage.yProperty().set(0);
        bearImage.yProperty().set(0);
        bearImage.xProperty().set(0);
        candyImage.yProperty().set(0);
        smartphoneImage.yProperty().set(0);
        box = null;
        box = new GiftBox();
    }
    
    @FXML
    public void listGifts(ActionEvent e){
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        if(btn.isSelected() == false){
                clearGifts(e);
                return;
             }
        switch(id){
            case "teddyBear":
                    box = new Toy(box);
                    box.setImage(bearImage);   
                    System.out.println(box.getDescription());
                break;
            case "tshirt":
                    box = new tshirt(box);
                    box.setImage(tshirtImage);   
                    System.out.println(box.getDescription());
                break;
            case "smartphone":
                    box = new Smartphone(box);
                    box.setImage(smartphoneImage);   
                    System.out.println(box.getDescription());
                break;
            case "candy":
                    box = new Candy(box);
                    box.setImage(candyImage);   
                    System.out.println(box.getDescription());
                break;
        }
    }
}