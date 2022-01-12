package ejercicio.pkg13;

import java.util.Scanner;

public class Ejercicio13 {
    /*Escriba un programa que valide si una nota está entre 0 y 10,
    sino está entre 0 y 10 la nota se pedirá de nuevo 
    hasta que la nota sea correcta*/

    public static void main(String[] args) {
       int nota;
       System.out.println("Ingrese una nota del 1 al 10");
       Scanner numero= new Scanner(System.in);
       nota=numero.nextInt();
       while (nota < 0 || nota > 10){
           System.out.println("La nota es incorrecta,vuelva a ingresar la nota");
           nota=numero.nextInt();
              
       }
     if ((nota>0)&&(nota<11)){
        System.out.println("La nota ingresada es correcta y el valor es"+" "+nota);
       }
    }
    
}
