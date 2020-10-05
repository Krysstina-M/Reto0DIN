/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import controller.Utilidades;
import java.util.Properties;
import model.Model;
import model.ModelFactory;
import view.View;
import view.ViewFactory;

/**
 * Contiene los métodos para ejecutar la vista o el modelo
 *
 * @author Cristina Milea y Jonathan Viñán
 */
public class Application {

    /**
     * Clase Aplicación para la aplicación HolaMundoMVC
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
       
        
        opcion = menu();

       
           if (opcion==1) {
            View pruebaVista;
            ViewFactory pruebaVistaFactory = new ViewFactory();
            pruebaVista = pruebaVistaFactory.getView();

            Model pruebaModel;
            ModelFactory pruebaModelFactory = new ModelFactory();
            pruebaModel = pruebaModelFactory.getModel();

            Controller prueba = new Controller(pruebaVista, pruebaModel);
            prueba.run();
        }else{
            View pruebaVista;
            ViewFactory pruebaVistaFactory = new ViewFactory();
            pruebaVista = pruebaVistaFactory.getViewI();

            Model pruebaModel;
            ModelFactory pruebaModelFactory = new ModelFactory();
            pruebaModel = pruebaModelFactory.getModel();

            Controller prueba = new Controller(pruebaVista, pruebaModel);
            prueba.run();
           }
            

       
            
            
        

    }

    private static int menu() {
        int opc = 0;
        System.out.println("M E N U");
        System.out.println("1.-Texto Grafico\n"+
                            "2.-Texto Interfaz\n");
        opc = Utilidades.leerInt(1, 3);

        return opc;
    }
}
