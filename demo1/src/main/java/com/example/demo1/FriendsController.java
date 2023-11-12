// FriendsController.java
package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class FriendsController {
    @FXML
    private ListView<String> friendsListView;

    public void initialize() {
        // Inicialize a lista de amigos (pode obter esses dados de onde você armazena a lista de amigos)
        friendsListView.getItems().addAll("Amigo 1", "Amigo 2", "Amigo 3");
    }
}
