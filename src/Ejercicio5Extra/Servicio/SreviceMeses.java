//Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
//programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
//un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
//ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
package Ejercicio5Extra.Servicio;

import Ejercicio5Extra.Entidad.MesesAño;
import java.util.Scanner;

public class SreviceMeses {

    MesesAño meses = new MesesAño();
    Scanner leer = new Scanner(System.in);

    //Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas.
    public void crearArrayMeses() {
        String auxMeses[] = new String[12];
        auxMeses[0] = "enero";
        auxMeses[1] = "febrero";
        auxMeses[2] = "marzo";
        auxMeses[3] = "abril";
        auxMeses[4] = "mayo";
        auxMeses[5] = "junio";
        auxMeses[6] = "julio";
        auxMeses[7] = "agosto";
        auxMeses[8] = "septiembre";
        auxMeses[9] = "octubre";
        auxMeses[10] = "nobiembre";
        auxMeses[11] = "diciembre";
        meses.setMeses(auxMeses);
        
    }

    // A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
    public void crearMesSecreto() {
        meses.setMesSecreto(meses.getMeses()[2]);
    }

// El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
//un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
//ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
    public void adivinarMes() {
        System.out.print("Adivine el mes secreto: ");
        String adivinar;
        do {
            adivinar = leer.next();
            if (adivinar.equals(meses.getMesSecreto())) {
                System.out.println("Ha acertado!");
            } else {
                System.out.print("No ha adivinado. intente adivinarlo introduciendo otro mes: ");
            }
        } while (!adivinar.equals(meses.getMesSecreto()));
    }
    
}
