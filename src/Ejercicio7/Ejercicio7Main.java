
package Ejercicio7;

import Ejercicio7.Entidades.Persona;
import Ejercicio7.Servicio.ServisPersona;

public class Ejercicio7Main {

    public static void main(String[] args) {
        ServisPersona sp = new ServisPersona();
        //Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
//mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
        int mayor = 0;
        int menor = 0;
        int bajoPeso = 0;
        int pesoNormal = 0;
        int sobrePeso = 0;
        Persona[] persona = new Persona[4];
        for (int i = 0; i < 4; i++) {
            persona[i] = sp.crearPersona();
            System.out.println(persona[i]);
            System.out.println(sp.calcularIMC(persona[i]));
            System.out.println(sp.esMayorDeEdad(persona[i]));
            if (sp.esMayorDeEdad(persona[i])) {
                mayor += 1;
            } else {
                menor += 1;
            }
            if (sp.calcularIMC(persona[i]) == (-1)) {
                bajoPeso += 1;
            } else if (sp.calcularIMC(persona[i]) == 0) {
                pesoNormal += 1;
            } else {
                sobrePeso += 1;
            }
        }
        System.out.println(mayor + " personas son mayores de edad y " + menor + " son menores");
        System.out.println(bajoPeso + " personas tienen sobre peso, "+ pesoNormal+ " tienen peso normal y "+ sobrePeso+ " tienen sobre peso");

    }

}
