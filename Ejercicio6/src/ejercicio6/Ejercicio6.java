package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
 el doble, el triple y la raíz cuadrada de ese número.
 Nota: investigar la función Math.sqrt(). */
        public static void main(String[] args) {
 int num,doble,triple;
 double raiz;
 System.out.print("Ingrese un número para hacer los respectivos calculos");
 Scanner numero= new Scanner(System.in);
 num= numero.nextInt();
 doble=num*2;
 triple=num*3;
 raiz=(double)Math.sqrt(num);
 System.out.println("El doble del numero es:"+doble);
  System.out.println("El triple del numero es:"+triple);
   System.out.println("La raiz del numero es:"+raiz);
    }
    
}
