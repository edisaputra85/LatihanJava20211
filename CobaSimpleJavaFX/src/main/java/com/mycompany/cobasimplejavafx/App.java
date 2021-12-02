package com.mycompany.cobasimplejavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();//variabel string memperoleh nilai dari class SystemInfo
        var javafxVersion = SystemInfo.javafxVersion();//variabel string
        //node
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Label labelNama = new Label();
        labelNama.setText("Edi Saputra");
        
        Button btn = new Button();
        btn.setText("Click Me!");
        
        TextField par1 = new TextField();
        TextField par2 = new TextField();
        
        HBox nodeHbox = new HBox();
        nodeHbox.getChildren().addAll(par1,par2);
        
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");
        
        HBox nodeOperator = new HBox();
        nodeOperator.getChildren().addAll(btnAdd,btnSub,btnMul,btnDiv);
        
        Label result = new Label("0");
        
        
        
        //membuat handler ketika btn diklik
        btn.setOnAction((ActionEvent event) -> {
            labelNama.setText("Hello Edi Saputra");
        });
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
        //memasukkan node ke dalam rootNode
        //rootNode.getChildren().add(label);
        //rootNode.getChildren().add(labelNama);
        //rootNode.getChildren().add(btn);
        rootNode.getChildren().addAll(label,labelNama,btn);
        rootNode.getChildren().add(nodeHbox);
        rootNode.getChildren().add(nodeOperator);
        rootNode.getChildren().add(result);
        
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