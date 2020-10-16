/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.controlador;
import Modelo.modelo;
import Vista.VistaOperacion;

/**
 * Clase Main 
 * @author Daniel Zambrano
 * @since 16/10/2020
 * @version 1.0.0
 */
public class Main {
    
    /**
     * Se crean objeto de tipo vista y de tipo modelo y 
     * de tipo controlador luego en el constructor del controlador se pasa
     * como parametro el objeto de tipo vista  y el onjeto de tipo modelo
     * @param args 
     */
    public static void main(String args []){
       modelo mod = new modelo();
       VistaOperacion view =new VistaOperacion();
       controlador controller = new controlador (view , mod);
       controller.iniciar();
       view.setVisible(true);
    }
}
