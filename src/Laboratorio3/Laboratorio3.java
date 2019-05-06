package Laboratorio3;
public class Laboratorio3 {
    public static void main(String[]args){ // Punto 1
        Entrenador ent1 = new Entrenador("Iván","Futbol");  
        System.out.println("Primera Impresion: ");
        System.out.println("Entrenador "+ent1.getContadorEntrenadores()+": "+ent1.getNombre()+"\t Tipo: "+ent1.getTipo());
        Entrenador ent2 = new Entrenador("Maxi","Voley");
        System.out.println("Entrenador "+ent2.getContadorEntrenadores()+": "+ent2.getNombre()+"\t Tipo: "+ent2.getTipo());
        Entrenador ent3 = new Entrenador("Mauro","Tenis");
        System.out.println("Entrenador "+ent3.getContadorEntrenadores()+": "+ent3.getNombre()+"\t Tipo: "+ent3.getTipo());
        Entrenador ent4 = new Entrenador("Franco","Golf");
        System.out.println("Entrenador "+ent4.getContadorEntrenadores()+": "+ent4.getNombre()+"\t Tipo: "+ent4.getTipo());
        Entrenador ent5 = new Entrenador("Gabriel","Rugby");
        System.out.println("Entrenador "+ent5.getContadorEntrenadores()+": "+ent5.getNombre()+"\t Tipo: "+ent5.getTipo());
        
        ent1 = new Entrenador("Franco","Rugby");
        System.out.println("\nSegunda Impresion: ");
        System.out.println("Entrenador "+ent1.getContadorEntrenadores()+": "+ent1.getNombre()+"\t Tipo: "+ent1.getTipo());
        ent2 = new Entrenador("Maxi","Tenis");
        System.out.println("Entrenador "+ent2.getContadorEntrenadores()+": "+ent2.getNombre()+"\t Tipo: "+ent2.getTipo());
        ent3 = new Entrenador("Alejandro","Golf");
        System.out.println("Entrenador "+ent3.getContadorEntrenadores()+": "+ent3.getNombre()+"\t Tipo: "+ent3.getTipo());
        ent4 = new Entrenador("Francisco","Softbol");
        System.out.println("Entrenador "+ent4.getContadorEntrenadores()+": "+ent4.getNombre()+"\t Tipo: "+ent4.getTipo());
        ent5 = new Entrenador("Michael","Rugby");
        System.out.println("Entrenador "+ent5.getContadorEntrenadores()+": "+ent5.getNombre()+"\t Tipo: "+ent5.getTipo());
    }
}
