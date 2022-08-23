//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package Ejercicio5.Servicio;

import Ejercicio5.Entidades.CuentaBancaria;
import java.util.Scanner;

public class ServisCuentaBancaria {

    public CuentaBancaria crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introdusca el numero de cuenta");
        int numeroCliente = leer.nextInt();
        System.out.println("Introdusca el DNI del cliente");
        long DNICliente = leer.nextLong();
        System.out.println("Introdusca el saldo actual");
        int saldoActual = leer.nextInt();
        return new CuentaBancaria(numeroCliente, DNICliente, saldoActual);
    }

    public int ingresar(int ingreso, CuentaBancaria cb) {
        cb.setSaldoActual(cb.getSaldoActual() + ingreso);
        return cb.getSaldoActual();
    }

    public int retirar(int retiro, CuentaBancaria cb) {
        if (cb.getSaldoActual() - retiro < 0) {
            cb.setSaldoActual(0);
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
        }
        return cb.getSaldoActual();
    }

    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
    public int extraccionRapida(int retiroRapido, CuentaBancaria cb) {
        if (retiroRapido < (cb.getSaldoActual() * 0.2)) {
            cb.setSaldoActual(cb.getSaldoActual() - retiroRapido);
        } else {
            System.out.println("No es posible sacar esa cantidad de dinero");
        }
        return cb.getSaldoActual();
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es de $" + cb.getSaldoActual());
    }

    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Su saldo actual es de $" + cb.getSaldoActual());
        System.out.println("El DNI del cliente es: " + cb.getDNICliente());
        System.out.println("El numero de cuenta es: " + cb.getNumeroCuenta());
    }

    public void menu(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Ingrese la opcion que dese ejecutar\n"
                    + "1- Ingresar dinero\n"
                    + "2- Retirar dinero\n"
                    + "3- Extraccion rapida\n"
                    + "4- Consultar saldo\n"
                    + "5- Consultar datos\n"
                    + "6- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cuanto dinero deseea ingresar");
                    int ingresar = leer.nextInt();
                    ingresar(ingresar, cb);
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar");
                    int retirar = leer.nextInt();
                    retirar(retirar, cb);
                    break;
                case 3:
                    System.out.println("Haremos una extraccion rapida."
                            + "Cuanto dinero desea retirar?");
                    int retiroRapido = leer.nextInt();
                    extraccionRapida(retiroRapido, cb);
                    break;
                case 4:
                    consultarSaldo(cb);
                    break;
                case 5:
                    System.out.println("Los datos de la cuenta son:");
                    consultarDatos(cb);
                    break;

            }
        } while (op != 6);

    }

}
