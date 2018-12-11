package command;


import javafx.scene.image.ImageView;

public class Santa {
    private static Boolean status = false;

    public void on() {
        status = true;
        System.out.println("The Santa Claus is displayed on the screen.");
    }

    public void off() {
        status = false;
        System.out.println("The Santa Claus is hidden from the screen.");
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("The Santa Claus is displayed on the screen.");

        imageView.setVisible(true);
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("The Santa Claus is hidden from the screen.");

        imageView.setVisible(false);
    }

    public Boolean getStatus() {
        return status;
    }
}
