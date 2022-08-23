
package Ejercicio7.Servicio;

import Ejercicio7.Entidades.Persona;
import java.util.Scanner;

public class ServisPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje
  //  nombre, edad, sexo('H' hombre, 'M' mujer, 'O' otro), peso y altura.
    public Persona crearPersona(){
        System.out.println("Introdusca el nombre"); 
        String nombre = leer.next();
        System.out.println("Introdusca la edad");
        int edad = leer.nextInt();
        System.out.println("Introdusca el sexo: H, M, O");
        char s = leer.next().charAt(0);
        char sexo = Character.toUpperCase(s);
        if (sexo != 'H' && sexo != 'M' && sexo != 'O' ){
            System.out.println("La letra que ha ingresado es incorrecta... Le pondremos como sexo 'OTRO'");
            sexo = 'O';
        }
        System.out.println("Introdusca el peso");
        double peso = leer.nextDouble();
        System.out.println("Introdusca la altura");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    //• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int calcularIMC(Persona p){
        double pesoIdeal = p.getPeso()/(p.getAltura()*p.getAltura());
        int resultado;
        if (pesoIdeal<20){
            resultado = -1;
        } else if (pesoIdeal>20 && pesoIdeal<=25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }
    //• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
    public boolean esMayorDeEdad(Persona p){
        boolean mayor = false;
        if(p.getEdad()>=18){
            mayor = true;
        }
        return mayor;
    }
}
