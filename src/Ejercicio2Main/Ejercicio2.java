//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
package Ejercicio2Main;

import Ejercicio2Main.Entidad.Circunferencia;
import Ejercicio2Main.Servicio.ServisCircunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {
       ServisCircunferencia src = new ServisCircunferencia();
        Circunferencia c1 = src.crearCircunferencia();
        src.area(c1);
        src.perimetro(c1);
        
    }
    
}
