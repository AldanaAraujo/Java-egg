package ejercicio.pkg7;

import java.util.Scanner;

public class Ejercicio7 {
/* Implementar un programa que dado dos números enteros
determine cuál es el mayor y lo muestre por pantalla.*/
    public static void main(String[] args) {
 double num1,num2;
 System.out.println("Ingrese dos numeros para saber cual es el mayor");
 Scanner valor1= new Scanner(System.in);
 Scanner valor2= new Scanner (System.in);
 num1=valor1.nextDouble();
 num2=valor2.nextDouble();
 if (num1!=num2){
        if (num1>num2){
         System.out.print("El numero mayor es:"+ num1);   }
        else {
         System.out.print("El numero mayor es el numero"+num2);
 else
        System.out.print("Los numeros son iguales");
 }
    
}}}
    
