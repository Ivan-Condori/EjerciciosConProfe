package Laboratorio3;
public class Entrenador {
    private int idEntrenador;
    private String nombre;
    private String tipo;
    private static int contadorEntrenadores;

    public Entrenador(String nombre, String tipo){
    this.nombre = nombre;
    this.tipo = tipo;
    idEntrenador = ++contadorEntrenadores;
    }

    Entrenador() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static int getContadorEntrenadores() {
        return contadorEntrenadores;
    }

}
