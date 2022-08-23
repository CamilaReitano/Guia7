//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
package Ejercicio11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NewMain {

    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Introdusca dia, mes y año");
//        int anio = leer.nextInt();
//        int mes = leer.nextInt();
//        int dia = leer.nextInt();
//        Date fecha = new Date(anio, mes, dia);
//        //Date fecha = new Date(122, 07, 15);
//        Date fechaActual = new Date();
//        System.out.println(fecha);
//        System.out.println(fechaActual);
//        SimpleDateFormat modificaEstiloFecha = new SimpleDateFormat("dd/MM/yyyy");
//        String fechaOrdenada = modificaEstiloFecha.format(fecha);
//        System.out.println(fechaOrdenada);
//        
//        long tiempoTranscurrido = fechaActual.getTime() - fecha.getTime();
//        TimeUnit unidad = TimeUnit.DAYS;
//        long dias = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
//        System.out.println("Los dias de diferencia son " + dias );
        
        
        //------------------OTRA OPCION--------------------------------
        
        LocalDate primerFecha = LocalDate.of(2000, Month.MARCH, 14);
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println(primerFecha);
        System.out.println(fechaActual);
        
        Period periodo = Period.between(primerFecha, fechaActual);
        System.out.println("Diferencia de años: "+ periodo.getYears()+", diferencia de meces: "+ periodo.getMonths()+", diferencia de "
                + "dias: "+ periodo.getDays());
    }

}
