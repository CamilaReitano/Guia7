//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio2).
//e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
package Ejercicio2Main.Servicio;

import Ejercicio2Main.Entidad.Circunferencia;
import java.util.Scanner;

public class ServisCircunferencia {
     //Circunferencia cir = new Circunferencia();
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca el radio");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    public double area(Circunferencia cir){
       
        double area = Math.PI * ( cir.getRadio() * cir.getRadio());
        System.out.println("Area:" + area);
        return area;
    }
    
    public double perimetro(Circunferencia cir){
        double perimetro = 2 * Math.PI * cir.getRadio();
        System.out.println("Perimetro:" + perimetro);
        return perimetro;
    }
}
