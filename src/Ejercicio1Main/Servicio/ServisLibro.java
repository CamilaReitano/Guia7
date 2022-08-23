// Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package Ejercicio1Main.Servicio;

import Ejercicio1Main.Entidad.Libro;
import java.util.Scanner;

public class ServisLibro {
    public Libro crearLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca el ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Introdusca el titulo");
        String titulo = leer.next();
        System.out.println("Introdusca el autor");
        String autor = leer.next();
        System.out.println("Introdusca la cantidad de paginas");
        int numPag = leer.nextInt();
        return new Libro(ISBN, titulo, autor, numPag);
    }
    
    public void mostrarLibro (Libro libro){
        System.out.println(libro);
    }
}
