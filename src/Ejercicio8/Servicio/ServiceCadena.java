//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
//ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
package Ejercicio8.Servicio;

import Ejercicio8.Entidad.Cadena;
import java.util.Scanner;

public class ServiceCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
//ingresada.
    public static int mostrarVocales(Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador += 1;
            }
        }
        System.out.println("La frace ingresada tiene " + contador + " vocales");
        return contador;
    }

    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrace(Cadena c) {
        String invertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            invertida = invertida + c.getFrase().charAt(i);
        }

        System.out.println(invertida);
    }

    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena c) {
        System.out.println("Introdusca la letra que desee encontrar");
        char letra = leer.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == letra) {
                contador += 1;
            }
        }
        System.out.println("La letra " + letra + " se repite " + contador + " veces");
    }
    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.

    public void compararFrace(Cadena c) {
        System.out.println("Introdusca una nueva frace");
        String frace2 = leer.next();
        if (c.getLongitud() > frace2.length()) {
            System.out.println("La frace 1 es mayor a la frace 2");
        } else {
            System.out.println("La frace 2 es mayor a la frace 1");
        }
    }

    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrace(Cadena c, String frace) {
        String fraceUnida = c.getFrase().concat(frace);
        System.out.println("La frace unida es: " + fraceUnida);
    }

    //g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//frase resultante.
    public void reemplazar(Cadena c, String letra, String caracter) {
        String nuevaFrace = "";
        String letra1 = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            letra1 = c.getFrase().substring(i, (i + 1));
            if (letra1.equals(letra)) {
                letra1 = caracter;
            }
            nuevaFrace += letra1;
        }
        System.out.println(nuevaFrace);
    }
    //h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene (Cadena c, String letra){
        String letra1 = "";
        boolean contiene = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            letra1 = c.getFrase().substring(i, (i + 1));
            if(letra1.equals(letra)){
                contiene = true;
            }
        }
        return contiene;
    }
            
}
