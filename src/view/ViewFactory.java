/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Cristina Milea
 */
public class ViewFactory {
    
    /**
     * 
     * @return 
     */
    
    public View getView()
    {
        return new ViewImplementation();
    }
}
