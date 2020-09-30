/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import model.Model;
import model.ModelFactory;
import view.View;
import view.ViewFactory;

/**
 *
 * @author Cristina Milea y Jonathan Viñán
 */
public class Application {

    /**
     * Clase Aplicación para la aplicación HolaMundoMVC
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        View pruebaVista;
        ViewFactory pruebaVistaFac=new ViewFactory();
        pruebaVista=pruebaVistaFac.getView();
        
        Model pruebaModel;
        ModelFactory pruebaModelFac=new ModelFactory();
        pruebaModel=pruebaModelFac.getModel();
        
        Controller prueba=new Controller();
        prueba.run(pruebaVista, pruebaModel);
    }
}
