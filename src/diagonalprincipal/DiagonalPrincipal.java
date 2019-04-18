package diagonalprincipal;
public class DiagonalPrincipal {
    public static void main(String[] args) {   
        
        int valores[][] = new int[][]{{2, 3, 4},{5, -6, 7},{-1, 2, -4}};
        int diag1 = 0;
        int diag2 = 0;
        
        for (int i = 0; i < valores.length; i++) {            
            for( int j = 0; j < valores.length; j++) {
                if((i-j) == 0) {
                    diag1 += valores[i][j];
                }                
                if((i+j) == (valores.length-1)) {
                    diag2 += valores[i][j];
                }               
            }            
        }
        Diagonal resolver = new Diagonal(diag1, diag2);
        System.out.println("Diferencia de la Suma de una matriz 3 x 3:");
        System.out.println("");
        System.out.println("Resultado: " + resolver.resultado());
        
    }   
}
