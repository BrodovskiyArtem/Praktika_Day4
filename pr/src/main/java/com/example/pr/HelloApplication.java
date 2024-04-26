package com.example.pr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        primaryStage.setTitle("Вітаємо!");
        primaryStage.setScene(new Scene(root, 500, 281));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}