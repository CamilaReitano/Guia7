//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
package ejercicio10.servicio;

import ejercicio10.Entidad.Arreglos;
import java.util.Arrays;
import java.util.Scanner;

public class ServiceArreglos {
    Arreglos a = new Arreglos();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//el programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    public void crearArreglo1 (){
        double[] array1 = new double [50];
       
        for (int i = 0; i < 50; i++) {
           array1[i]= (int) (Math.random() * 100);
        }
        
        for (int i = 0; i < 50; i++) {
            System.out.print(array1[i]);
        }
        a.setArray1(array1);
    }
    
    public void imprimirArreglo(double[] arreglo){
        System.out.println("********ARREGLO*******");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            System.out.print(",");
        }
    }
    //Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos
    public void ordenarArreglo(){
        Arrays.sort(a.getArray1());
        imprimirArreglo(a.getArray1());
        double[] array11 = a.getArray1();
        double[] array2 = new double[20];
        for (int i = 0; i < array2.length; i++) {
            if(i<10){
                array2[i]= array11[i];
            } else {
                array2[i] = 0.5;
            }
        }
        a.setArray2(array2);
        imprimirArreglo(a.getArray2());
    }
}
