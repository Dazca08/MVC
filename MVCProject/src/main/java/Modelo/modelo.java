/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



/**
 * Clase modelo 
 * @author Daniel Zambrano
 * @since 16/10/2020
 * @version 1.0.0
 */
public class modelo {
    /**
     * variable que almacena el valor del dolar a cambiar 
     */
    private double dolar;
    /**
     * variable que almacena el valor actual equivalente a un dolar en pesos 
     * colombianos
     */
    private final double valorCambioCop = 3848.10;
    /**
     * variable que almacena el valor actual equivalente a un dolar
     * en yenes
     */
    private final double valorCambioYen = 105.36;
    /**
     * variable que almacena el valor actual equivalente a un dolar
     * en euros
     */
    private final double valorCambioEuro = 0.85;
    /**
     * arreglo que almacena el valor las divisas en una posicion
     * segun el valor en dolares ingresados
     */
    private  double [] divisas = new double[3] ;
    
    /**
     * metodo que multiplica el valor ingresado en dolares por el 
     * usuario por el valor de cada divisa y lo alamacena en una posicion
     * del arreglo divisas.
     */
    public void  divisas(){
        
        getDivisas()[0]=getDolar()*valorCambioCop;
        getDivisas()[1]=getDolar()*valorCambioYen;
        getDivisas()[2]=getDolar()*valorCambioEuro;
    }

    /**
     * @return the dolar
     */
    public double getDolar() {
        return dolar;
    }

    /**
     * @param dolar the dolar to set
     */
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    /**
     * @return the divisas
     */
    public double[] getDivisas() {
        return divisas;
    }

    /**
     * @param divisas the divisas to set
     */
    public void setDivisas(double[] divisas) {
        this.divisas = divisas;
    }
}
