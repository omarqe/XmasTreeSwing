package command;


import javafx.scene.image.ImageView;

public class Santa {
    private static Boolean status = false;
    private static SantaAudio santaAudio = new SantaAudio();

    public void on() {
        status = true;
        System.out.println("The Santa Claus is displayed on the screen.");

        santaAudio.play();
    }

    public void off() {
        status = false;
        System.out.println("The Santa Claus is hidden from the screen.");

        santaAudio.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("The Santa Claus is displayed on the screen.");

        imageView.setVisible(true);

        santaAudio.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("The Santa Claus is hidden from the screen.");

        imageView.setVisible(false);

        santaAudio.stop();
    }

    public Boolean getStatus() {
        return status;
    }
}
