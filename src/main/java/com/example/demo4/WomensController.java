package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class WomensController
{

    @FXML
    private Button buykwomens1;

    @FXML
    private Button buywomens2;

    @FXML
    void buywomen1onAction(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("women1.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("Womens1!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void buywomens2onAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("women2.fxml"));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 600, 442.0);
        stage.setTitle("Womens2!");
        stage.setScene(scene);
        stage.show();

    }

}
