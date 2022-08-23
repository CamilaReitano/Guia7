
package Ejercicio5.Entidades;

import Ejercicio5.Servicio.ServisCuentaBancaria;

public class Ejercicio5 {

    public static void main(String[] args) {
       ServisCuentaBancaria servisCuenta = new ServisCuentaBancaria();
       CuentaBancaria cb = servisCuenta.crearCuenta();
       servisCuenta.menu(cb);
    }
    
}
