package mordi.test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Component {
    protected ImageView imageView;
    protected double x, y;

    public Component(String imagePath, double x, double y) {
        this.imageView = new ImageView(new Image(imagePath));
        this.x = x;
        this.y = y;
        updatePosition();
    }

    // Oppdater posisjonen til komponenten
    public void updatePosition() {
        imageView.setLayoutX(x);
        imageView.setLayoutY(y);
    }

    // Flytt komponenten
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        updatePosition();
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void performAction() {
        // Generisk handling, kan overskrives i subklasser
        System.out.println("Component performs action");
    }
}