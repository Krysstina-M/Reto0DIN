/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFX;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.View;
import view.ViewImplementation;

/**
 *
 * @author jonyv
 */
public class JavaFXInterfaz extends Application implements View {

     private String saludo;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {
        
   
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInterface.fxml"));
            Parent root = (Parent) loader.load();
            FXMLInterfaceController viewController = ((FXMLInterfaceController) loader.getController());
            viewController.setGreeting(saludo);
            viewController.setStage(primaryStage);
            viewController.iniciarStage();
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws Exception {
        this.saludo = getParameters().getRaw().get(0);
    }
    
     @Override
    public void showGreeting(String greeting) {
        launch(greeting);

    }

}
