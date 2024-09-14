package com.example.portsytemca1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchController {

    @FXML
    private Stage stage;

    private Scene scene;
    private Parent root;
    public void switchToPort(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Port.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
//
    public void switchToPortControls(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PortControls.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSave(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Save.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToView(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
