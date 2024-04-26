package com.example.pr;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    void initialize() {
    }

    @FXML
    private void openForm1(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("form1.fxml")));
            Scene scene = new Scene(root);

            Stage stage = (Stage) button1.getScene().getWindow(); // Используем текущее окно
            stage.setScene(scene);
            stage.setTitle("Магазин");

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}