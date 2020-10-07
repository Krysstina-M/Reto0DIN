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
 * Clase que ejecurata la ventana
 *
 * @author Cristina Milea y Jonathan Viñán
 */
public class JavaFXInterfaz extends Application implements View {

    private String saludo;

    /**
     *
     * @param primaryStage Parametro para que la que la ventana se ejecute en
     * primer plano
     * @throws FileNotFoundException Controla si existe el fichero de
     * propiedades
     * @throws IOException Controla la E/S
     */
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
            Parent root = (Parent) loader.load();
            FXML_Controller viewController = ((FXML_Controller) loader.getController());
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
