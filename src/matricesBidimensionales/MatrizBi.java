package matricesBidimensionales;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class MatrizBi {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int [][] miMatrizA = {{4,12,3},{5,2,9}};
        
        /*for (int i=0; i<miMatrizA.length; i++){
            for (int j=0; j<miMatrizA[i].length; j++){
                System.out.print(miMatrizA[i][j]+"");
            }
            System.out.println();
        }*/
        System.out.println("====[Presentar una Matriz definida]====\n");
        presentarMatriz(miMatrizA);
        
        System.out.println("\n====[Ingresar Datos en una Matriz]====\n");
        int [][] miMatrizB = new int[3][3];
        
        ingresarDatos(miMatrizB);
        
        System.out.println("\n====[Crear una Matriz de 0]====\n");
        crearMatriz();
    }
    
    // Método para ingresar datos en una matriz bidimensional
    public static void ingresarDatos(int m[][]){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print("Ingrese el elemento ["+i+"]["+j+"]: ");
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------");
        presentarMatriz(m);
    }
    
    // Método para presentar los elemntos de una matriz bidimensional
    public static void presentarMatriz(int m[][]){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print("["+m[i][j]+"]"+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
    
    // Método para crear una matriz bidimensional
    public static void crearMatriz(){
        System.out.print("Ingrese el número de filas: ");
        int f = sc.nextInt(); 
        System.out.print("Ingrese el número de columnas: ");
        int c = sc.nextInt();
        System.out.println("--------------------------------");
        int [][] m = new int[f][c];
        ingresarDatos(m);
    }
    
}
