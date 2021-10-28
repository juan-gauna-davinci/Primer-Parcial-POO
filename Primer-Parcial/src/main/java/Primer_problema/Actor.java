package Primer_problema;

public class Actor {

    //ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;


    //CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }


    //METODOS

    public int calcularEdad (int anioActual){
        int edad = this.anioNacimiento - anioActual;
        return edad ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "`Actor:"+ nombre +" "+ apellido +" "+ "("+pais+")" ;
    }
}
