package mordi.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    // TEST IKKE BEHOLD
    static Boolean bollemus = true;

    Image imOn = new Image(getClass().getResource("/oving0/todolist/led_on.png").toExternalForm());
    Image imOff = new Image(getClass().getResource("/oving0/todolist/led_off.png").toExternalForm());

    @FXML
    private AnchorPane anchorPane; // FXML-feltet for AnchorPane

    @FXML
    private ImageView myImageView;

    @FXML
    private Button myBtn;  // Referanse til knappen i FXML-filen

    // Variabler for å holde styr på initial posisjon
    private double initialX;
    private double initialY;

    @FXML
    private void initialize() {
        // Når musen trykkes ned på bildet, lagre den nåværende posisjonen
        myImageView.setOnMousePressed(event -> {
            initialX = event.getSceneX() - myImageView.getLayoutX();
            initialY = event.getSceneY() - myImageView.getLayoutY();
        });

        // Når musen dras, oppdater bildet til den nye posisjonen
        myImageView.setOnMouseDragged(event -> {
            double deltaX = event.getSceneX() - initialX;
            double deltaY = event.getSceneY() - initialY;

            // Flytt bildet
            myImageView.setLayoutX(deltaX);
            myImageView.setLayoutY(deltaY);
        });
    }

    @FXML
    private void fitte() {
        // Hva som skal skje når knappen trykkes
        System.out.println("Hello World");

        if (bollemus) {

            myImageView.setImage(imOn);
            bollemus = false;
        }

        else {
            myImageView.setImage(imOff);
            bollemus = true;
        }
    }
}