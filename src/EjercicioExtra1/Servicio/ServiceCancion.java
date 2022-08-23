
package EjercicioExtra1.Servicio;

import EjercicioExtra1.Entidad.Cancion;
import java.util.Scanner;

public class ServiceCancion {
    public Cancion crearCancion (){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introdusca el nombre de la cancion");
        String titulo = leer.next();
        System.out.println("Itrodusca el autor");
        String autor = leer.next();
        
        return new Cancion(titulo, autor);
    }
    
    public void mostrarCancion (Cancion c){
        System.out.println(c);
    }
}
