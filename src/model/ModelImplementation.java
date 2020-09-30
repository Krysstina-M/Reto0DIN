/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Contiene los métodos necesarios para implementar el saludo en el modelo
 * @author Cristina Milea y Jonathan Viñán
 */
public class ModelImplementation implements Model {

    /**
     * Método para leer el saludo del archivo de propiedades
     * @return Devuelve el String que guarda el saludo
     */
   
    public String getGreeting() {
               
        ResourceBundle saludo=ResourceBundle.getBundle("properties.saludo");
        String greeting=saludo.getString("greeting");
        return greeting;
    }
}
