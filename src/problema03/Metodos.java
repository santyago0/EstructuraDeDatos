package problema03;

/**
 *
 * @author santy
 */
public class Metodos {
    public static void restaMatriz(int n, int m, int a[][], int b[][]){
        int array[][]= new int[n][m];
        System.out.println("\n---Resta de Matrices---");
        System.out.println("\nEl resultado de la resta de las matrices ingresadas es: ");
        System.out.println("");
        
        for(byte i = 0; i < array.length; i++){
            System.out.print("[");
            for(byte j = 0; j < array[i].length; j++){
                array[i][j] = a[i][j] - b[i][j];
                System.out.printf("%5d",array[i][j]);
            }
            System.out.println("]");
        }
    }
    
    public static void productoMatriz(int n, int m, int a[][],int b[][]){
        int suma_mult = 0;    
        int matriz_C[][] = new int[n][m];
        System.out.println("\n---Producto de Matrices---");
        System.out.println("\nEl resultado del producto de las matrices ingresadas es: ");
        System.out.println("");
        
        for (int f = 0; f < a.length; f++) {
            System.out.print("[");
            for (int c = 0; c < b[0].length; c++) {
                for (int i = 0; i < b.length; i++) {   
                    suma_mult = suma_mult + (a[f][i] * b[i][c]);
                }
                matriz_C[f][c] = suma_mult;
                suma_mult = 0;
                System.out.printf("%5d",matriz_C[f][c]);
            }
                System.out.println("]");
            }
    }
    
    public static void sumDiagonal(int a[][], int b[][]){
        int sumDp = 0;
        int sumDp2 = 0;
        int x = a.length - 1;
        int y = b.length - 1;
        System.out.println("\n---Suma de la Diagonal Secundaria---");
        System.out.println("\n---Primera Matriz---");
        
        for(int i = 0; i < a.length; i++){
            sumDp = sumDp + (a[i][x]);
            x--;
        }
        
        System.out.println("El resultado de la suma de la diagonal "
                + "Secundaria de la Matriz 1 es: " + sumDp);
        System.out.println("\n---Segunda Matriz---");
        
        for(int i = 0; i < b.length; i++){
            sumDp2 = sumDp2 + b[i][y];
            y--;
        }
        
        System.out.print("El resultado de la suma de la diagonal "
                + "Secundaria de la Matriz 2 es: " + sumDp2);
    }
    
}
