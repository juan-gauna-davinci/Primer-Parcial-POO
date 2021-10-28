package Primer_problema;

import java.util.ArrayList;

public class Pelicula {
    //ATRIBUTOS
    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actores = new ArrayList<Actor>();


    //CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int anio, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    //METODOS

    public void agregarActor(Actor actor){
        this.actores.add(actor);
    }

    public void eliminarActor(Actor actor){
        this.actores.remove(actor);
    }

    public void mostrarActores(){
        for (int i = 0; i < this.actores.size(); i++) {
            System.out.println(this.actores.get(i).nombre);
        }
        System.out.println( actores + " de la película " + titulo );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo +" ("+ anio +")";
    }
}
