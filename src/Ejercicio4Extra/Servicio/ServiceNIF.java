//• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
//• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
//mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
//de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
//un array (vector) de caracteres la posición que corresponda al resto de la división para
//obtener la letra correspondiente. La tabla de caracteres es la siguiente:
package Ejercicio4Extra.Servicio;

import Ejercicio4Extra.Entidad.NIF;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceNIF {

    Scanner leer = new Scanner(System.in);
   // NIF n = new NIF();
    
    public String[] crearArray() {
        String letras[] = new String[23];
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";
        //n.setLetras(letras);
        return letras;
    }
//• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    public NIF crerNif() {
        String letras[] = crearArray();
        System.out.println("Introdusca el DNI");
        long DNI = leer.nextLong();
        long numero = DNI % 23;
        String letra="";
        for (int i = 0; i < 23; i++) {
            if (numero == i) {
                letra = letras[i];
            }
        }
        return new NIF(DNI, letra, letras);
    }
    
    //• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
//mayúscula; por ejemplo: 00395469-F).
    public void mostrar(NIF n){
        System.out.println(n.getDNI() +"-"+ n.getLetra());
    }
}
