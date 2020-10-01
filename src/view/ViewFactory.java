/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
}
