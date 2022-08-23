//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
package Ejercicio3.Servicio;

import Ejercicio3.Entidades.Operacion;
import java.util.Scanner;

public class ServisOperacion {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca el numero 1");
        int num1 = leer.nextInt();
        System.out.println("Introdusca el numero 2");
        int num2 = leer.nextInt();
        return new Operacion(num1, num2);
    }
    
    public int sumar (Operacion op){
        int suma = op.getNum1() + op.getNum2();
        return suma;
    }
    
    public int resta (Operacion op){
        int resta = op.getNum1() - op.getNum2();
        return resta;
    }
    
    public int multiplicar (Operacion op){
        int multiplicacion = 0;
        if (op.getNum1() !=0 && op.getNum2() !=0){
             multiplicacion = op.getNum1() * op.getNum2();
        } else {
            System.out.println("No se puede hacer la cuenta si un numero es 0");
        }
        return multiplicacion;
    }
    
    public double dividir (Operacion op){
        double dividir = 0;
        if (op.getNum1() !=0 && op.getNum2() !=0){
             dividir = op.getNum1() / op.getNum2();
        } else {
            System.out.println("No se puede hacer la cuenta si un numero es 0");
        }
        return dividir;
    }
}
