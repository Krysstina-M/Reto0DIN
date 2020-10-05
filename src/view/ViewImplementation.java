/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javaFX.FXMLInterfaceController;
import javaFX.JavaFXInterfaz;
import static javafx.application.Application.launch;

/**
 * Contiene la implementación de la vista que muestra un mensaje de texto en la
 * interfaz del usuario
 *
 * @author Cristina Milea y Jonathan Viñán
 */
public class ViewImplementation implements View {

    /**
     * Muestra un saludo en la interfaz del usuario
     *
     * @param greeting un String que muestra el saludo
     */
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
      
}
