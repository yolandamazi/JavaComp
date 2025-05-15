
package poo.javacomp.logica;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Venta implements Serializable {
    private Date fechaVenta;
    private Cliente cliente;
    private ArrayList<Producto> productosComprados;
    
    //Constructores
    public Venta(Date fechaVenta, Cliente cliente, ArrayList<Producto> productosComprados) {
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.productosComprados = productosComprados;
    }
    
    //Métodos
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(ArrayList<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

}
