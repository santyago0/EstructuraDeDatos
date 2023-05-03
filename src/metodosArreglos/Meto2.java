package metodosArreglos;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Meto2 {
    // Método para dar la dimensión a un arreglo
    public static int dimension(){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Ingrese la dimensión del arreglo: ");
        x = sc.nextInt();
        return x;
    }
    
    // Método para ingresar datos por teclado a un arreglo
    public static void insertarDatos(int [] x){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<x.length; i++){
            System.out.print("Ingresar elemento de posición ["+i+"]: ");
            x[i] = sc.nextInt();
        }
    }
    
    // Método para presentar los elementos de un arreglo
    public static void presentarArreglo(int [] x){
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+"\t");
        }
        System.out.println();
    }
    
    // Método para buscar un elemento de un arreglo y devuelve su índice
    public static int busquedaSecuencial(int [] x,int n){
        for(int i=0; i<x.length; i++){
            if(x[i] == n){
                return i;
            }
        }
        return -1;
    }
    
    //Método para eliminar (un elemento/el elemento del índice ingresado)
    public static void eliminarElemento(int [] x, int n){
        int posicion = busquedaSecuencial(x, n);
        if(posicion != -1){
            for(int i=posicion; i<x.length-1; i++){
                x[i] = x[i+1];
                x[i+1] = 0;
            }
            //x[x.length-1] = 0;
        }else
            System.out.println("El elemento no existe...");
    }
    
}
