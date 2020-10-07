/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Contiene los métodos necesarios para obtener los datos de la implementación
 * @author Cristina Milea y Jonathan Viñán
 */
public class ModelFactory {
    
    /**
     * Método para crear una nueva implementación
     * @return Devuelve lo que hay dentro de la clase ModelImplementation
     */
    
    public Model getModel() {
        ModelImplementation model = new ModelImplementation();
        return model; 
    }
}
