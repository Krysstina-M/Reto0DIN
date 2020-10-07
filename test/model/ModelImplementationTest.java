/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Contiene los métodos del test de la clase Modelimplementation
 * @author Cristina Milea y Jonathan Viñán
 */
public class ModelImplementationTest {
    
    public ModelImplementationTest() {
    }

    /**
     * Comprueba si el saludo del archivo de propiedades es el mismo que hemos declarado aqui
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Hola mundo <3";
        String result = instance.getGreeting();
        assertEquals("El saludo que guarda no coincide", expResult, result);
    }
   
}