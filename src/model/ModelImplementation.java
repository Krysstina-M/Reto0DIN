/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Contiene los métodos necesarios para implementar el saludo en el modelo
 * @author Cristina Milea
 */
public class ModelImplementation implements Model {

    /**
     * Método para guardar el saludo
     * @return Devuelve el String que guarda el saludo
     */
   
    @Override
    public String getGreeting() {
        String greeting="Hola mundo";
        
        return greeting;
    }
}
