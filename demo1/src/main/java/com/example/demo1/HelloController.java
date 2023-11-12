// HelloController.java
package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    public void login() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Configuração de tamanho mínimo da nova tela
        Stage dashboardStage = new Stage();
        dashboardStage.setTitle("Dashboard");
        dashboardStage.setScene(scene);
        dashboardStage.setMinWidth(400); // Defina o valor desejado para a largura mínima
        dashboardStage.setMinHeight(300); // Defina o valor desejado para a altura mínima
        dashboardStage.setResizable(false);
        dashboardStage.show();
    }
}
