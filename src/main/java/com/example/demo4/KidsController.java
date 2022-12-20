package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class KidsController {

    @FXML
    private Button buykids1;

    @FXML
    private Button buykids2;

    @FXML
    void buykids1onAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("kids1.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("Kids1!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void buykids2onAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("kids2.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("kids2");
        stage.setScene(scene);
        stage.show();

    }

}
