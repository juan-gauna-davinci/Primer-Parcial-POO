package Primer_problema;

import java.util.ArrayList;

public class Cine {


    //ATRIBUTOS

    String nombre ;
    String ciudad ;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    //CONSTRUCTORES

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    //METODOS

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }

    public void mostrarPeliculas(){
        for (int i = 0; i < this.peliculas.size(); i++) {
            System.out.println(this.peliculas.get(i).titulo);
        }
        System.out.println("Peliculas de la cartelera en:"+ this.nombre +" "+ peliculas  );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Bienvenido al Cine : "+ this.nombre;
    }
}
