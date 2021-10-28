package Primer_problema;

public class Actor {

    //ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int añoNacimiento;


    //CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.añoNacimiento = añoNacimiento;
    }


    //METODOS

    public int calcularEdad (int anioActual){
        int edad = this.añoNacimiento - anioActual;
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

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    @Override
    public String toString() {
        return "`Actor:"+ nombre +" "+ apellido +" "+ "("+pais+")" ;
    }
}
