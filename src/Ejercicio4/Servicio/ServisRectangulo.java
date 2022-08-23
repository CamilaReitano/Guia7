//. También incluirá un método para calcular la
//superficie del rectángulo     y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package Ejercicio4.Servicio;

import Ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

public class ServisRectangulo {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);
    }

    public int superficie(Rectangulo r) {
        int superficie = r.getBase() * r.getAltura();

        return superficie;
    }

    public int perimetro(Rectangulo r) {
        int perimetro = (r.getBase() + r.getAltura()) * 2;
        return perimetro;
    }

    public void hacerRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || i == (r.getAltura() - 1)) {
                    System.out.print(" * ");
                } else if (j == 0 || j == r.getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
