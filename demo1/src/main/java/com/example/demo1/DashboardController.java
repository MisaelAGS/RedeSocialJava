// DashboardController.java
package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class DashboardController {
    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private void showFriends() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("friends-view.fxml"));
        VBox friendsView = fxmlLoader.load();

        // Adicione a tela de amigos à parte direita da BorderPane
        mainBorderPane.setCenter(friendsView);
    }

    @FXML
    private void showRequests() {
        // Lógica para mostrar solicitações (implemente conforme necessário)
    }

    @FXML
    private void exitApplication() {
        // Lógica para sair da aplicação (implemente conforme necessário)
    }


}
