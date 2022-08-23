
package Ejercicio4Extra;

import Ejercicio4Extra.Entidad.NIF;
import Ejercicio4Extra.Servicio.ServiceNIF;

public class Ejercicio4ExtraMain {

    public static void main(String[] args) {
        ServiceNIF sn = new ServiceNIF();
        NIF n = sn.crerNif();
        sn.mostrar(n);
        
    }
    
}
