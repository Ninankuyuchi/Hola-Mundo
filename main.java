/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesdecero.Ejercicio1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el monto de su cuenta: ");
        Double cantidad = scanner.nextDouble();
        Cuenta cuenta = new Cuenta(nombre, cantidad);
        cuenta.toString();
        
        
        
    }
}
