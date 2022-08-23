
package Ejercicio12;

import Ejercicio12.Entidad.Persona;
import Ejercicio12.Servicio.ServicePersona;


public class Ejercicio12Main {

    public static void main(String[] args) {
        ServicePersona sr = new ServicePersona();
        Persona p1 = sr.crearPersona();
        sr.calcularEdad(p1);
        System.out.println("La primer persona es menor que la segunda? " + sr.menorQue(p1, 30));
        sr.mostrarPersona(p1);
    }
    
}
