//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package Ejercicio9.Servicio;

import Ejercicio9.Entidad.Matematica;

public class ServiceMatematica {

    public double devolverMayor(Matematica m) {
        double mayor = Math.max(m.getNum1(), m.getNum2());
        return mayor;
    }
    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.

    public double calcularPotencia(Matematica m) {
        double mayor = Math.max(m.getNum1(), m.getNum2());
        double menor = Math.min(m.getNum1(), m.getNum2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        double potencia = Math.pow(mayor, menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("la potencia es: " + potencia);
        return potencia;
    }

    //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(Matematica m) {
        double menor = Math.min(m.getNum1(), m.getNum2());
        double raiz = Math.sqrt(menor);
        System.out.println("La raiz del numero es: " + raiz);
        return raiz;
    }
}
