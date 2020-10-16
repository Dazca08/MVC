/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.Vista;
import Vista.VistaOperacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase controlador 
 * @author Daniel Zambrano
 * @since 16/10/2020
 * @version 1.0.0
 */
public class controlador implements ActionListener{
    /**
     * variable que crea un nuevo ojeto vistaOperacion
     */
    private VistaOperacion view;
    /**
     * variable que crea un nuevo objeto modelo
     */
    private modelo model;
    /**
     * contructor que inicializa las variables
     * @param view
     * @param model 
     */
    public controlador(VistaOperacion view , modelo model){
        this.view=view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    /**
     * Metodo que pone titulo y ubica el frame
     */
    public void iniciar(){
        view.setTitle("MVC_MULTIPLICAR");
        view.setLocationRelativeTo(null);
    }
    /**
     * Metodo que permite usar los actionlistener de la vista 
     * en este Metodo se parsean los valores ingresados por el usuario 
     * y se realiza la operacion , ademas que se le otorga el valor del resultado 
     * a la vista
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }

   
}
