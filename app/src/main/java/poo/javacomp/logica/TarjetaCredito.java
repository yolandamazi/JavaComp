
package poo.javacomp.logica;

import java.io.Serializable;
import java.util.Date;

public class TarjetaCredito implements Serializable {
   private String nombreTitular;
   private long numero;
   private Date fechaCaducidad;
   
   //Constructores
    public TarjetaCredito(String nombreTitular, long numero, Date fechaCaducidad) {
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
   
    //Metodos
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    
    
}
