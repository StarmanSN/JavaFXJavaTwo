package com.example.javafxjavatwo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controllers {
    @FXML
    TextArea mainTextArea;

    @FXML
    TextField enter;

    @FXML
    public void onButtonClick(ActionEvent actionEvent) {
        actionEvent.getSource();
        mainTextArea.appendText(enter.getText() + "\n");
    }

    public void enter() {
        mainTextArea.appendText(enter.getText() + "\n");
    }
}