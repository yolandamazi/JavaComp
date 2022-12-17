
package poo.javacomp.logica;

import java.time.LocalDate;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;

public class Opinion implements Serializable {
    private int calificacion;
    private String comentario;
    private LocalDate fecha;
    
    //Constructores
    public Opinion(int calificacion, String comentario, LocalDate fecha) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }
    
    
    //Métodos
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yy");
        return "Opinion{" + "calificacion=" + calificacion + ", comentario=" + comentario + ", fecha=" + fecha.format(formatoCorto) + '}';
    }

}
