package Ejercicio6Extra.Servicio;

import Ejercicio6Extra.Entidad.Ahorcado;
import java.util.Scanner;

public class ServiceAhorcado {

    Scanner leer = new Scanner(System.in);
    Ahorcado a = new Ahorcado();
    //• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.

    public void crearJuego() {

        System.out.println("Introdusca la palabra a adivinar");
        String palabra = leer.next();
        String[] auxPalabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            auxPalabra[i] = palabra.substring(i, i + 1);
        }
        a.setBuscar(auxPalabra);
        System.out.println("Introdusca la cantidad de intentos que deseea realizar");
        a.setJugadasMaximas(leer.nextInt());
        a.setEncontradas(0);
    }
    
    // Muestra la palabra ingresada por el usuario
    public void mostrarPalabra(){
        for (int i = 0; i < longitud(); i++) {
            System.out.print(a.getBuscar()[i]);
        }
        System.out.println("");
    }

    //• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public int longitud() {
        int longitudPalabra = a.getBuscar().length;
        return longitudPalabra;
    }

    //• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public int buscarLetra(String letra) {
        int contador = 0;
        for (int i = 0; i < a.getBuscar().length; i++) {
            if (a.getBuscar()[i].equals(letra)) {
                if(contador==0){
                    System.out.println("La letra pertenece a la palabra");
                }
                System.out.println("La letra se encuentra en la posicion "+ (i+1));
                contador = contador +1;
            }
        }
        return contador;
    }

    //• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(String letra) {
        boolean encontradas = false;
        int aux = buscarLetra(letra);
        if(aux>0){
            a.setEncontradas((a.getEncontradas()+aux));
            encontradas = true;
        } else {
            System.out.println("La letra no pertenece a la palabra");
            a.setJugadasMaximas((a.getJugadasMaximas()-1));
        }
         System.out.println("Numero de letras: Encontradas:" + a.getEncontradas() + " Faltantes:" + (longitud() - a.getEncontradas()));
       return encontradas;
    }

    //• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public int intentos() {
        int intentos = a.getJugadasMaximas();
        return intentos;
    }

    //• Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego() {
        crearJuego();
        System.out.println("La longitud de la palabra es: "+longitud());
        do {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            encontradas(letra);
            System.out.println("Numero de intentos restantes:" + intentos());
            if (a.getEncontradas()==longitud()){
                System.out.println("Felicidades has ganado!!");
            }
            if (intentos() == 0){
                System.out.println("GAME OVER");
            }
            
        } while (intentos() != 0 && a.getEncontradas() != longitud());
         System.out.print("La palabra es ");
                mostrarPalabra();
    }
}
