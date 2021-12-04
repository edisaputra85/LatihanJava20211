package com.mycompany.cobasimplejavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        TextField par1 = new TextField();
        TextField par2 = new TextField();
        
        //Pane : HBox
        HBox nodeHbox = new HBox();
        //set alignment
        nodeHbox.setAlignment(Pos.CENTER);
        //set spacing
        nodeHbox.setSpacing(20);
        //set padding
        nodeHbox.setPadding(new Insets(30));
        //nodeHbox.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        nodeHbox.getChildren().addAll(par1,par2);
        
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");
        
        HBox nodeOperator = new HBox();
        nodeOperator.setSpacing(20);
        nodeOperator.setAlignment(Pos.CENTER);
        nodeOperator.setPadding(new Insets(20));
        //nodeOperator.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        nodeOperator.getChildren().addAll(btnAdd,btnSub,btnMul,btnDiv);
        
        Label result = new Label("0");
        result.setFont(Font.font("Cambria", 32));
        HBox resultBox = new HBox();
        resultBox.setAlignment(Pos.CENTER);
        resultBox.getChildren().add(result);
       
        //handling untuk tombol add
        btnAdd.setOnAction((ActionEvent event) -> {
            try{
            int x = Integer.valueOf(par1.getText())+Integer.valueOf(par2.getText());
            result.setText(String.valueOf(x));   
            }
            catch(NumberFormatException ex){
                System.out.println("Input data salah"); 
            }
                
        });
        
        //rootNode
        VBox rootNode = new VBox();
        rootNode.getChildren().add(nodeHbox);
        rootNode.getChildren().add(nodeOperator);
        rootNode.getChildren().add(resultBox);
        
        //buat objek scene dan masukkan rootNode ke dalam scene
        Scene scene = new Scene(rootNode, 320, 240);
        //masukkan scene ke dalam stage
        stage.setScene(scene);
        //menampilkan stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}