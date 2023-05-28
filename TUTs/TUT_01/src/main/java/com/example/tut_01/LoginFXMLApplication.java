package com.example.tut_01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFXMLApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginFXMLApplication.class.getResource("Sign-up.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 522, 734);
        stage.setTitle("Sign Up!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}