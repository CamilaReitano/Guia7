//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package Ejercicio6.Servicio;

import Ejercicio6.Entidades.Cafetera;
import java.util.Scanner;

public class ServisCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        int capacidadMaxima = 100;
        int capacidadActual = capacidadMaxima;
        return new Cafetera(capacidadMaxima, capacidadActual);
    }

    //• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    public void servirTaza(Cafetera c) {

        System.out.println("De que tamaño es la taza?\n"
                + "1-Chica\n"
                + "2-Mediana\n"
                + "3-Grande");
        int op = leer.nextInt();
        int tamaño = 0;
        switch (op) {
            case 1:
                System.out.println("Taza chica");
                tamaño = 10;
                //System.out.println("Llenando");
                break;
            case 2:
                System.out.println("Taza mediana");
                tamaño = 20;
                //System.out.println("Llenando");
                break;
            case 3:
                System.out.println("Taza grande");
                tamaño = 30;
                //System.out.println("Llenando");
                break;
        }
        if (tamaño < c.getCantidadActual()) {
            c.setCantidadActual(c.getCantidadActual() - tamaño);
            System.out.println("Llenando...");
            System.out.println("Se lleno al 100%");
        } else {
            System.out.println("Llenando...");
            System.out.println("Se lleno " + c.getCantidadActual() + "ml");
            c.setCantidadActual(0);;

        }

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera c) {
        System.out.println("Cuanto cafe deseea agregar?");
        int agregar = leer.nextInt();
        if ((agregar + c.getCantidadActual()) > 100) {
            c.setCantidadActual(100);
        } else {
            c.setCantidadActual(c.getCantidadActual() + agregar);
        }
    }
    
    public void mostrarCafetera(Cafetera c){
        System.out.println("La cafetera tiene: " + c.getCantidadActual()+ "ml");
    }

    public void menu(Cafetera c) {
        int op = 0;

        do {
            System.out.println("Elija la opcion que desee ejecutar:\n"
                    + "1-Servir Taza\n"
                    + "2-Vaciar cafetera\n"
                    + "3-Agregar cafe\n"
                    + "4-Mostrar cantidad de la cafetera\n"
                    + "5-Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    servirTaza(c);
                    break;
                case 2:
                    vaciarCafetera(c);
                    break;
                case 3:
                    agregarCafe(c);
                    break;
                case 4:
                    mostrarCafetera(c);
                    break;
            }
        } while (op != 5);
    }
}
