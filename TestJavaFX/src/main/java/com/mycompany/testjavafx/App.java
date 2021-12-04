package com.mycompany.testjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        TabPane tabPane = new TabPane();

        Tab tab1 = new Tab("Planes");
        Tab tab2 = new Tab("Cars");
        Tab tab3 = new Tab("Boats");
       
        Button btn1 = new Button("Planes");
        Button btn2 = new Button("Cars");
        Button btn3 = new Button("Boats");
        
        tab1.setContent(btn1);
        tab2.setContent(btn2);
        tab3.setContent(btn3);
        
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);

        VBox vBox = new VBox(tabPane);
         
        Scene scene = new Scene(vBox,640,480);
        stage.setScene(scene);
        stage.show();
       
    }
    public static void main(String[] args) {
        launch();
    }

}