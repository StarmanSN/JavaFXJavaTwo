package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.nio.Buffer;

public class Controller {
    @FXML
    TextArea mainTextArea;

    @FXML
    Button btn;

    public void buttonClickAction(ActionEvent actionEvent) {
        actionEvent.getSource(); //ссылка на кнопку
        mainTextArea.appendText("pressed\n");
    }
}
