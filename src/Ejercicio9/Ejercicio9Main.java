// En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
package Ejercicio9;

import Ejercicio9.Entidad.Matematica;
import Ejercicio9.Servicio.ServiceMatematica;

public class Ejercicio9Main {

    public static void main(String[] args) {
     
     ServiceMatematica sm = new ServiceMatematica();
     Matematica mc = new Matematica();
     mc.setNum1(Math.random()*100);
     mc.setNum2(Math.random()*100);
        System.out.println(mc.getNum1()+" "+ mc.getNum2());
        System.out.println("El numero mayor es " + sm.devolverMayor(mc));
       sm.calcularPotencia(mc);
       sm.calcularRaiz(mc);
        
    }
    
}
