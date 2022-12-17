
package poo.javacomp.logica;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
    private String nombre;
    private String correo;
    private String clave;
    private Direccion direccion; //asociacion
    private TarjetaCredito tarjetaCredito; //asociacion
    private long telefono;
    
    //Constructores
    public Cliente(String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjetaCredito, long telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.direccion = direccion;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
    }
    
    public Cliente (){
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", direccion=" + direccion + ", tarjetaCredito=" + tarjetaCredito + ", telefono=" + telefono + '}';
    }

}
