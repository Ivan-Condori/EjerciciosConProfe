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
      
//    private String nombre;
//    private String tipo;
//    public Entrenador(){ // Punto 2
//    }
//    public Entrenador(String nombre, String tipo){ // Punto 3
//    this.nombre = nombre;
//    this.tipo = tipo;
//    }
//    public void setEntrenador(String nombre, String tipo ){
//        this.nombre=nombre;
//        this.tipo=tipo;
//    }
//    public void indicarEntrenamiento(){ // Punto 4
//        System.out.println("Mi nombre es "+this.nombre+ " y soy entrenador de "+this.tipo);
//        }

    
}
