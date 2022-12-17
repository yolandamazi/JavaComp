
package poo.javacomp.logica;

import java.io.Serializable;

public class ClienteEmpresa extends Cliente implements Serializable {
    private String cif;
    private String web;
    
    //Constructores
    public ClienteEmpresa(String cif, String web, String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjetaCredito, long telefono) {
        super(nombre, correo, clave, direccion, tarjetaCredito, telefono);
        this.cif = cif;
        this.web = web;
    }
    
    public ClienteEmpresa(){
        
    }
    
    //Métodos
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "cif=" + cif + ", web=" + web + '}';
    }
    
    
}
