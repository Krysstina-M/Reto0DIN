/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Contiene los métodos de la vista para ser controlados por un controlador
 * @author Cristina Milea
 */
public interface View {
    
    /**
     * Muestra un saludo en la interfaz del usuario
     * @param greeting un String que muestra el saludo
     */
    
    public void showGreeting (String greeting);
}
