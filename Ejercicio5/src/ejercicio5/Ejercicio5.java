/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/* @author AldanaNahir*/
public class Ejercicio5 {
    public static void main(String[] args) {
       /*Dada una cantidad de grados grados centígrados 
        se debe mostrar su equivalente en Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5)*/
       
     int c,F;
     Scanner temperatura= new Scanner(System.in);
     System.out.println("Ingrese la temperatura en grados centigrados");
     c= temperatura.nextInt();
     F=32+(9*c/5);
     System.out.println("La temperatura en grados Fahrenheit es de" + " " +F);
     

     
             
    }
    
}
