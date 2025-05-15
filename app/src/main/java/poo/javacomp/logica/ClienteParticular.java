
package poo.javacomp.logica;

import java.io.Serializable;
import java.util.Objects;

public class ClienteParticular extends Cliente implements Serializable {
    private String dni;
    
    //Constructores
    public ClienteParticular(String dni, String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjetaCredito, long telefono) {
        super(nombre, correo, clave, direccion, tarjetaCredito, telefono);
        this.dni = dni;
    }
    
    public ClienteParticular(){
    }
    //Métodos
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ClienteParticular{" + "dni=" + dni + '}';
    }
    
}
