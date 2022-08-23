
package Ejercicio1Main;

import Ejercicio1Main.Entidad.Libro;
import Ejercicio1Main.Servicio.ServisLibro;

public class Ejercicio1 {

    public static void main(String[] args) {
     ServisLibro sl = new ServisLibro();
     Libro l1 = sl.crearLibro();
     sl.mostrarLibro(l1);
       
     
    }
    
}
