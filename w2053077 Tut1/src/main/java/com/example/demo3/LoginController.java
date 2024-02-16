package com.example.demo3;



import javafx.fxml.FXML;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ToggleGroup;


import java.io.IOException;


public class LoginController {
    @FXML
    private ToggleGroup genderToggleGroup;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;


    @FXML
    private Button signupButton;

    @FXML
    public void handleLogin() {
        // Implement login functionality
    }

    @FXML
    public void handleClear() {
        usernameField.clear();
        passwordField.clear();
    }


    @FXML
    public void handlesignup() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signupform.fxml"));
            Parent root = loader.load();
            stage.setScene(new Scene(root, 500, 600));
            stage.setTitle("Signup");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


