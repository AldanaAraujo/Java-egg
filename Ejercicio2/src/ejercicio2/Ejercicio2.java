/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/*
 * @author AldanaNahir
 */
public class Ejercicio2 {
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //introduzco 2 numeros por teclado
       double num1, num2, suma;
       
       Scanner leer= new Scanner(System.in);
      System.out.println("Ingrese dos números a sumar");
      num1=leer.nextDouble();
      num2=leer.nextDouble();
      //realizo la suma y muestro el resultado
      suma=num1 + num2;
      System.out.println("La suma de los numeros es" + suma);
      
       
    }
    
}
