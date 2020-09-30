/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import view.View;
import view.ViewFactory;

/**
 *
 * @author Cristina Milea
 */
public class Application {

    /**
     * Clase Aplicación para la aplicación HolaMundoMVC
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        View pruebaVista;
        ViewFactory pruebaVistaFactory=new ViewFactory();
        pruebaVista=pruebaVistaFactory.getView();
    }
}
