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
     * variable que almacena el primer numero a multiplicar
     */
    private int numeroUno;
    /**
     * variable que almacena el segundo numero a multiplicar
     */
    private int numeroDos;
    /**
     * variable que almacena el resultado
     */
    private int resultado;

    /**
     * metodo que  realiza la operacion de la multiplicacion
     * @return 
     */
    public int multiplicar(){
        this.setResultado(this.getNumeroUno() * this.getNumeroDos());
       return this.getResultado();
    }

    /**
     * @return the numeroUno
     */
    public int getNumeroUno() {
        return numeroUno;
    }

    /**
     * @param numeroUno the numeroUno to set
     */
    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    /**
     * @return the numeroDos
     */
    public int getNumeroDos() {
        return numeroDos;
    }

    /**
     * @param numeroDos the numeroDos to set
     */
    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
