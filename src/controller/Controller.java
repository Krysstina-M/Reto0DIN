/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Model;
import view.View;

/**
 * Clase que controla lo que saldrá en la interfaz del usuario
 * @author Cristina Milea
 */
public class Controller {
    
    /**
     * Método para ejecutar el modelo y la vista en la interfaz del usuario
     * @param v Un parámetro de la clase View para llamar al método showGreeting
     * @param m Un parámetro de la clase Model para llamar al método getGreeting
     */
    
    public void run (View v, Model m) {
        String prueba=m.getGreeting();
        v.showGreeting(prueba);
    }
}
