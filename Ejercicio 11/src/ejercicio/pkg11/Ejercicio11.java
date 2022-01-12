package ejercicio.pkg11;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio11 {
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
    public static void main(String[] args) {
       String frase1,frase2;
       System.out.println("Ingrese una frase donde la primer letra sea una A");
       Scanner ingreso=new Scanner(System.in);
       frase1= ingreso.nextLine();
       frase1=frase1.toUpperCase();
       if (frase1.substring(0,1).equals("A")){
           System.out.print("La frase es correcta porque comienza con la letra A");
          
       }
       else {
           System.out.print("La frase es incorrecta porque no comienza con la letra A");
       }
       
       
    }

    private static Object Substring(String frase1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
