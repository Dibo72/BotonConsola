package org.example;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class BotonConsola extends Application {
    public void start(Stage stage){
        Button boton = new Button("Boton");

        boton.setOnAction(e -> {
            System.out.println("Boton pulsado");
        });

        VBox layout = new VBox(10, boton);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("BotonConsola");
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}