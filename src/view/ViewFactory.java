/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javaFX.FXML_Controller;
import javaFX.JavaFXInterfaz;

/**
 * Contiene los métodos necesarios para obtener los datos de la implementación
 * @author Cristina Milea y Jonathan Viñán
 */
public class ViewFactory {
    
    /**
     * Método para crear una nueva implementación
     * @return 
     */
    
    
    public View getView()
    {
        return new ViewImplementation();
    }

    /**
     *Método para crear una nueva implementación para la interfaz
     * @return 
     */
    public View getViewI()
    {
       JavaFXInterfaz view = new JavaFXInterfaz();
        return view;
    }
    
    
}
