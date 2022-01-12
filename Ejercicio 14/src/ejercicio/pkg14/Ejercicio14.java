
package ejercicio.pkg14;

import java.util.Scanner;


public class Ejercicio14 {
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
    public static void main(String[] args) {
        int num1,num2,suma,maximo;
        System.out.println("Ingrese un numero máximo o límite");
        Scanner valor=new Scanner(System.in);
        maximo= valor.nextInt();
        System.out.println("Ingrese dos numeros para realizar la operación");
        Scanner valor1= new Scanner(System.in);
        num1=valor1.nextInt();
        Scanner valor2=new Scanner(System.in);
        num2= valor2.nextInt();
        suma=num1+num2;
        if (suma>maximo){
            System.out.println("La suma de los numeros ingresados supera el maximo impuesto");
        }
        else 
            do {
                
             System.out.println("El valor de la suma de los numeros es"+" "+suma);
             System.out.println("Ingrese otro numero para agregar a la suma");
             num2=valor2.nextInt();
             suma=suma+num2;}
             while (suma<maximo) ;     
             
         
               
            
        System.out.println("El valor de la suma es"+" "+suma +" "+ "y el valor maximo es"+" "+maximo);
      
    }
}
