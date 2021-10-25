package com.example.javafxjavatwo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controllers {
    @FXML
    TextArea mainTextArea;

    @FXML
    TextField textField;

    @FXML
    Button btn;

    public void onButtonClick(ActionEvent actionEvent) {
        textField.setPromptText("Введите сообщение");
        actionEvent.getSource();
        mainTextArea.appendText(textField.getText() + "\n");
        textField.clear();
        System.out.println(mainTextArea.getText());
    }

    public void enter(ActionEvent actionEvent) {
        textField.setPromptText("Введите сообщение");
        actionEvent.getSource();
        mainTextArea.appendText(textField.getText() + "\n");
        textField.clear();
        System.out.println(mainTextArea.getText());
    }
}