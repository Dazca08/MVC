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
 *
 * @author daniel
 */
public class controlador implements ActionListener{
    private VistaOperacion view;
    private modelo model;
    public controlador(VistaOperacion view , modelo model){
        this.view=view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC_MULTIPLICAR");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(){
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
