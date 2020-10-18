/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.VistaOperacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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
        this.view.BotonOperacion.addActionListener(this);
    }
    /**
     * Metodo que asigna titulo al frame y le asigna una ubicacion
     */
    public void iniciar(){

        view.setTitle("MVC_DIVISAS");
        view.setLocationRelativeTo(null);
    }
    /**
     * Metodo que permite usar los actionlistener de la vista 
     * en este Metodo se asignan los valores ingresados por el usuario 
     * y se realiza la operacion , ademas que se le otorga el valor del resultado 
     * a la vista
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        model.setDolar(Double.parseDouble(view.Dolares.getText()));
        model.divisas();
        DecimalFormat formato = new DecimalFormat("#.00");
         view.Cop.setText(formato.format(model.getDivisas()[0]));
        view.Yen.setText(formato.format(model.getDivisas()[1]));
        view.Euro.setText(formato.format(model.getDivisas()[2]));
    }


   
}
