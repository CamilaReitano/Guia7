//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package Ejercicio8;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca un numero");
        int num = leer.nextInt();
        int suma = 0;
        for (int i = 0; suma < num; i++) {
            System.out.println("Introdusca un numero");
            int num1 = leer.nextInt();
            suma = suma + num1;
            System.out.println(suma);
        }

    }

}
