package ejercicio.pkg15;

import java.util.Scanner;

public class Ejercicio15 {
    /*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/

    public static void main(String[] args) {
        int num1,opcion,num2,suma,resta,multiplicacion,division;
        String elegir;
        System.out.println("Ingrese dos numeros para realizar alguna operacion");
        Scanner valor1= new Scanner(System.in);
        num1=valor1.nextInt();
        Scanner valor2=new Scanner(System.in);
        num2=valor2.nextInt();
        opcion=0;
        do {
            System.out.println("Elija la opcion que desea realizar"+
                    "1. Sumar" +
                    "2. Restar" +
                    "3. Multiplicar" +
                    "4. Dividir" +
                    "5. Salir");
            Scanner numero=new Scanner(System.in);
            opcion=numero.nextInt();
            switch (opcion){
                case 1:
                    suma=num1+num2;
                    System.out.println("El valor de la suma es"+" "+suma);
                    break;
                case 2:
                    resta=num1-num2;
                    System.out.println("El valor de la resta es"+" "+resta);
                    break;
                case 3:
                    multiplicacion=num1*num2;
                    System.out.println("El valor de la multiplicacion es"+" "+multiplicacion);
                    break;
                case 4:
                    division=num1/num2;
                    System.out.println("El valor de la division es"+" "+division);
                    break;
                case 5:
                    System.out.println("¿Desea salir del programa? S/N");
                    Scanner si=new Scanner(System.in);
                    elegir=si.nextLine();
                    if (equals(elegir)="S"){
                        System.out.println("Usted saldrá del programa");
                        opcion=5;
                        continue;
                       
                    }
                        else
                        System.out.println("Usted volverá al menú principal");
                        opcion=0;
                        break;
            }
        while (opcion==0);
                     
                      
    }
    }
}

