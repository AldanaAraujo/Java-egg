package ejercicio.pkg9;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
public class Ejercicio9 {

        public static void main(String[] args) {
      String frase;
      System.out.print("Ingrese la frase de asierto"+"   ");
      Scanner ingreso=new Scanner(System.in);
      frase= ingreso.nextLine();
      frase = toLowerCase(frase);
      if (frase.equals("eureka")){
          System.out.println("La palabra es correcta");
          
      }
      else {
          System.out.println("La palabra es incorrecta");
      }
      
        
    }
    
}
