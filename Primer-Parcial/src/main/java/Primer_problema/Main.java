package Primer_problema;

public class Main {
    public static void main(String[] args) {
        Actor primerActor = new Actor("Juan","Gauna","Argentina",1980);
        Actor segundoActor = new Actor("Gonzalo","ringo","Argentina",1980);
        Actor terceroActor = new Actor("Franco","Carrasco","Argentina",1980);
        Actor cuartoActor = new Actor("Agustin","lopez","Argentina",1980);

        Pelicula primeraPelicula = new Pelicula("Titanic",120,2000,"Romance");
        Pelicula segundaPelicula = new Pelicula("Rey Leon",120,2000,"Infantil");

        Cine nuevoCine = new Cine("Nuevo cine", "Buenos Aires");

        primeraPelicula.agregarActor(primerActor);
        primeraPelicula.agregarActor(segundoActor);
        segundaPelicula.agregarActor(terceroActor);
        segundaPelicula.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(primeraPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        primeraPelicula.mostrarActores();
        System.out.println("------------------");
        segundaPelicula.mostrarActores();
        System.out.println("------------------");
        nuevoCine.mostrarPeliculas();
        System.out.println("------------------");
    }
}
