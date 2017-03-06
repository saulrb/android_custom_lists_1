package mx.itesm.m6_srb_lab_listviewpersonalizada_1;

import java.io.Serializable;

/**
 * Created by saul on 12/2/2017.
 */

public class Libro implements Serializable{
    private String titulo;
    private String isbn;
    private String fechaPublicacion;
    private int idImagen;

    public Libro(String titulo, String isbn, String fechaPublicacion, int idImagen) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.idImagen = idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }
}
