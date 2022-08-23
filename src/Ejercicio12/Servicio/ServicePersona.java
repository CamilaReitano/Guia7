//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package Ejercicio12.Servicio;

import Ejercicio12.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicePersona {

    //• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Introdusca el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Introdusca la fecha de nacimiento");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fechaNacimiento = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNacimiento);

    }

    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        int anioNacimiento = p.getFechaNacimiento().getYear();
        int anioActual = fechaActual.getYear();
        int edad = anioActual - anioNacimiento;
                return edad;
    }

    //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(Persona p, int edad) {
        boolean esMenor = false;
        int edadPersona = calcularEdad(p);
        if (edadPersona < edad) {
            esMenor = true;
        }
        return esMenor;
    }
    //• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
    public void mostrarPersona(Persona p){
        System.out.println(p);
    }

}
