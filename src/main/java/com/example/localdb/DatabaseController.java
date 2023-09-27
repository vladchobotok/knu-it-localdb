package com.example.localdb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DatabaseController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}