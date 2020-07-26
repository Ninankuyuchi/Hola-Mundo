/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesdecero.Ejercicio1;

import java.math.BigDecimal;

/**
 *
 * @author LENOVO
 */
public class Cuenta {
    
    private String titular;
    private double cantidad;
    
    //El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior
    public Cuenta (String titular){
        this.titular = titular;
    }
    
    public Cuenta (String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad){
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        } else {
            System.out.println("cantidad ingresada negativa");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0){
            this.cantidad = this.cantidad - cantidad;
            if(this.cantidad < 0){
                this.cantidad = 0;
            } else {
            }
        } else {
            System.out.println("cantidad ingresada negativa");
        }
    }
    
    // Crea sus métodos get, set y toString.

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString(){
        String mensaje = "\nHola " + titular + " tiene " + cantidad +" euros en la cuenta";
        System.out.println(mensaje);
        return mensaje;
    }
    
}
