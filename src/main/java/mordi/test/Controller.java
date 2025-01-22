package mordi.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button myBtn;  // Referanse til knappen i FXML-filen

    @FXML
    private void fitte() {
        // Hva som skal skje når knappen trykkes
        System.out.println("Hello World");
    }
}