package problema02;

import java.awt.Color;

/**
 *
 * @author santy
 */
public class Metodos {
    // Método para crear una pirámide con una matriz cuadrática de dimensiones
    // impar
    public static void crearPiramide(String a[][]){
        // Variable para dividir los vectores de las filas en la mitad
        int mitad = a.length/2;
        
        // Matriz auxiliar para crear la parte vacía de la salida
        String aux [][] = new String[mitad][a[0].length];
        for (int i=0; i<aux.length; i++){
            for (int j=0; j<aux[i].length; j++){
                aux[i][j] = "\033[34m-"; // con ayuda del comando (\033[codigo 
                                         // del color + texto) cambiamos el 
                                         // color del String
            }
        }
        
        // Matriz auxiliar para crear la pirámide de asteriscos como tal
        String auxPiramide[][] = new String[mitad+1][a[0].length];
        for (int i=0; i<auxPiramide.length; i++){
            for (int j=0; j<auxPiramide[i].length; j++){
                auxPiramide[i][j] = "\033[34m-";
                // Condición para sustituir por asteriscos la parte central del
                // de los vectores de las filas, y generar la pirámide según los
                // escalones correspondientes
                if ((i+j) >= mitad && (j-i) <= mitad){
                    auxPiramide[i][j] = "\033[35m*";
                }
            }
        }
        
        // Matriz final, que es la combinación de la matriz auxiliar con la
        // parte vacía y la segunda matriz auxiliar con la pirámide de asteriscos
        int k = 0;
        for (int i=0; i<a.length; i++){
            if (i < mitad){
                for (int j=0; j<a[i].length; j++){
                    a[i][j] = aux[i][j];
                }
            }else if (i >= mitad){
                for (int j=0; j<a[i].length && k<auxPiramide.length; j++){
                    a[i][j] = auxPiramide[k][j];
                }
                k++;
            }
        }
    }
    
    // Método para presentar la pirámide
    public static void presentarPiramide(String a[][]){
        for (int i=0; i<a.length; i++){
            System.out.print("\t");
            for (int j=0; j<a[i].length; j++){
                System.out.print("\033[30m["+a[i][j]+"\033[30m] ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
}
