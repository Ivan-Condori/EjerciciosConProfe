package Laboratorio3;
public class Laboratorio3 {
    public static void main(String[]args){ // Punto 1
        Entrenador ent1 = new Entrenador("Iván","Futbol");      
        Entrenador ent2 = new Entrenador("Maxi","Voley");
        Entrenador ent3 = new Entrenador("Mauro","Tenis");
        Entrenador ent4 = new Entrenador("Franco","Golf");
        Entrenador ent5 = new Entrenador("Gabriel","Rugby");
        System.out.println("Primera Impresion: ");
        System.out.println("Entrenador 1: "+ent1.getNombre()+"\t Tipo: "+ent1.getTipo());
        System.out.println("Entrenador 2: "+ent2.getNombre()+"\t Tipo: "+ent2.getTipo());
        System.out.println("Entrenador 3: "+ent3.getNombre()+"\t Tipo: "+ent3.getTipo());
        System.out.println("Entrenador 4: "+ent4.getNombre()+"\t Tipo: "+ent4.getTipo());
        System.out.println("Entrenador 5: "+ent5.getNombre()+"\t Tipo: "+ent5.getTipo());
        
        ent1 = new Entrenador("Franco","Rugby");      
        ent2 = new Entrenador("Maxi","Tenis");
        ent3 = new Entrenador("Alejandro","Golf");
        ent4 = new Entrenador("Francisco","Softbol");
        ent5 = new Entrenador("Michael","Rugby");
        System.out.println("\nSegunda Impresion: ");
        System.out.println("Entrenador 1: "+ent1.getNombre()+"\t Tipo: "+ent1.getTipo());
        System.out.println("Entrenador 2: "+ent2.getNombre()+"\t Tipo: "+ent2.getTipo());
        System.out.println("Entrenador 3: "+ent3.getNombre()+"\t Tipo: "+ent3.getTipo());
        System.out.println("Entrenador 4: "+ent4.getNombre()+"\t Tipo: "+ent4.getTipo());
        System.out.println("Entrenador 5: "+ent5.getNombre()+"\t Tipo: "+ent5.getTipo());
        
//        Entrenador entrenador1 = new Entrenador();// Punto 5.1
//        entrenador1.setEntrenador("Francisco", "Tenis");
//        
//        entrenador1.indicarEntrenamiento(); // Punto 5.2
//        System.out.println("La variable entrenador1: "+entrenador1+"\n");// Punto 5.3
//
//        Entrenador entrenador2 = new Entrenador( "Iván", "Fútbol"); // Punto 5.4       
//        entrenador2.indicarEntrenamiento(); // Punto 5.5
//        System.out.println("La variable entrenador2: "+entrenador2); // Punto 5.6            
        
    }
}
