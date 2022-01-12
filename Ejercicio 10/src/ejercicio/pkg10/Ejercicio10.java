package ejercicio.pkg10;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Ejercicio10 {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
    public static void main(String[] args) {
        String frase;
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        frase=ingreso.nextLine();
        if (frase.length()==8){
            System.out.print("La Frase es correcta, tiene 8 caracteres");
        }
        else {
            System.out.print("La frase es incorrecta, no posee 8 caracteres");
        }
    }
    
}
