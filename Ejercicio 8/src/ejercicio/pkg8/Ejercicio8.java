package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {
/*Crear un programa que dado un numero determine si es par o impar*/
      public static void main(String[] args) {
        int num1;
        System.out.println("Ingrese un numero para determinar si es par o impar");
        Scanner valor= new Scanner(System.in);
        num1= valor.nextInt();
       if (num1 %2==0){
           System.out.println("El número"+" "+num1+ " "+"es par");
       } else {
           System.out.println("El numero ingresado es impar");
       }
        
    }
    
}
