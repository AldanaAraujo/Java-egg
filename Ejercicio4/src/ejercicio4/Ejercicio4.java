/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/* @author AldanaNahir*/
public class Ejercicio4 {
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
    y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cosa= new Scanner(System.in);
        System.out.print("Ingrese una Frase");
        String frase;
        String mayuscula;
        String minuscula;
        frase=cosa.nextLine();
        mayuscula= toUpperCase(frase);
        minuscula= toLowerCase(frase);
        System.out.println("La frase en mayusculas es" + (" ")+ mayuscula);
        System.out.println("La frase en minuscula es"+ (" ") +minuscula); 
        
        
        
      
        
    }
    
}
