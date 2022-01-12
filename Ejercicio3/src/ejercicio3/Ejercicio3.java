/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/* @author AldanaNahir//*/
public class Ejercicio3 {
    /*Escribir por pantalla un programa que pida tu nombre, 
    lo guarde en una variable y lo muestre */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre");
        nombre=leer.next();
        System.out.print("El nombre ingresado es" + " " + nombre);
        
        
    }
    
}
