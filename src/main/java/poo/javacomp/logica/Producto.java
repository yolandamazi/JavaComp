
package poo.javacomp.logica;

import java.io.Serializable;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Producto implements Serializable {
    private String titulo;
    private String caracteristicas;
    private String categoria;
    private double precio;
    private String nombreImagen;
    private int stock;
    private LocalDate fechaEntrada;
    private ArrayList<Opinion> opiniones;
            
    // Constructores
    public Producto (){
        
    }

    public Producto(String titulo, String caracteristicas, String categoria, double precio, String nombreImagen, int stock, LocalDate fechaEntrada, ArrayList<Opinion> opiniones) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.nombreImagen = nombreImagen;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
        this.opiniones = opiniones;
    }
    
    //Métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(ArrayList<Opinion> opiniones) {
        this.opiniones = opiniones;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yy");
        return "Producto{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", fechaEntrada=" + fechaEntrada.format(formatoCorto) + ", opiniones=" + opiniones + "Nombre Imagen:" + nombreImagen + '}';
    }
    
   
}
