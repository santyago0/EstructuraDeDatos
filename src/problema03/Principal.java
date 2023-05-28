package problema03;
/*  
  Crear un menú que permita realizar las operaciones siguientes:
    a. Resta de matrices
    b. Producto de matrices
    c. Suma de elementos de la diagonal secundaria
*/

import java.util.Scanner;
import static problema03.Metodos.*;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Presentacion del Programa 
        System.out.println("========================");
        System.out.println("Operaciones con Marices ");
        System.out.println("========================\n");
        
        // Declaracion de Variables y Creacion de Objetos
        Scanner lm = new Scanner(System.in);
        int n,m; 
        
        // Creacion y Llenado de la Matriz 
        System.out.print("Ingrese el numero de filas y columnas que desea en sus Matrices: ");
        n = lm.nextInt();
        m = n;
        System.out.println("\n---Primera Matriz---");
        
        int array[][] = new int [n][m];
        int array2[][] = new int [n][m];
        
        
        for(byte i = 0; i < array.length; i++){
            for(byte j = 0; j < array[i].length; j++){
                System.out.print("Ingrese el numero en la posicion [" + (i + 1) + ","+ (j + 1) + "]: ");
                array[i][j] = lm.nextInt(); 
            }
        }        
        
        System.out.println("\n---SegundoaMatriz---");
        
        for(byte i = 0; i < array2.length; i++){
            for(byte j = 0; j < array2[i].length; j++){
                System.out.print("Ingrese el numero en la posicion [" + (i + 1) + ","+ (j + 1) + "]: ");
                array2[i][j] = lm.nextInt();
            }
        }
        
        // Codigo para la resolución del problema con un menú de opciones
        boolean interruptor = true;
        int tickets = 1;
        while (interruptor){
            System.out.println("\nMENÚ DE OPCIONES:");
            System.out.println("1. Resta de Matices: ");
            System.out.println("2. Producto de Matrices: ");
            System.out.println("3. Suma de elemntos de la Diagonal Secundaria: ");
            System.out.println("4. Salir del Programa: ");
            System.out.print("\nElija su opción: ");
            int opcion = lm.nextInt();
            switch (opcion){
                case 1:
                    restaMatriz(n,m,array,array2);
                    System.out.println("");
                    break;
                case 2:
                    productoMatriz(n,m,array,array2);
                    System.out.println("");
                    break;
                case 3:
                    sumDiagonal(array,array2);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa...");
                    interruptor = false;
                    System.out.println("");
                    break;
                default:
                    System.out.println("\nOpción no válida");
                    System.out.println("");
            } 
        }
    }
    
}
