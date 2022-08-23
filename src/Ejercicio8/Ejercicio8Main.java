//En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
//través de los métodos set, se guardará la frase y la longitud de manera automática según
//la longitud de la frase ingresada.
package Ejercicio8;

import Ejercicio8.Entidad.Cadena;
import Ejercicio8.Servicio.ServiceCadena;
import java.util.Scanner;

public class Ejercicio8Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        System.out.println("Introdusca una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println(c1);
        ServiceCadena service = new ServiceCadena();
        service.mostrarVocales(c1);
        service.invertirFrace(c1);
        service.vecesRepetido(c1);
        service.compararFrace(c1);
        System.out.println("Introdusca una nueva frace");
        String frace1 = leer.next();
        service.unirFrace(c1, frace1);
        System.out.println("Introdusca una letra");
        String letra = leer.next();
        System.out.println("Introdusca un caracter");
        String caracter = leer.next();
        service.reemplazar(c1, letra, caracter);
        System.out.println("Introdusca la letra que desee encontrar");
        String encontrarLetra = leer.next();
        System.out.println("La letra "+ encontrarLetra+ " se encuentra? "+ service.contiene(c1, encontrarLetra));

    }

}
