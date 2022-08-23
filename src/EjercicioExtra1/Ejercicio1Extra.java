//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.
package EjercicioExtra1;

import EjercicioExtra1.Entidad.Cancion;
import EjercicioExtra1.Servicio.ServiceCancion;

public class Ejercicio1Extra {

    public static void main(String[] args) {
        ServiceCancion sr = new ServiceCancion();
        Cancion c = sr.crearCancion();
        sr.mostrarCancion(c);
                
    }
    
}
