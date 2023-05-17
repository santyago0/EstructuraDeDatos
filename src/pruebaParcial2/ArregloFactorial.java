package pruebaParcial2;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class ArregloFactorial {
    static Scanner sc = new Scanner(System.in);
    static int [] arreglo = new int[0];
    
    public static void main(String[] args) {
        System.out.println("=======[ARREGLO A]=======");
        crearArreglo(arreglo);
        
        System.out.println("\n===[FACTORIALES DEL ARREGLO A]===");
        arregloFactorial(arreglo);
    }
    
    // Método para presentar en un arreglo B los factoriales de un arreglo A
    public static void arregloFactorial(int[] m){
        int [] arregloB = new int[m.length];
        for (int i=0; i<arregloB.length; i++){
            arregloB[i] = factorial(m[i]);
        }
        presentarArreglo(arregloB);
    }
    
    // Método para encontrar el factorial de un número
    public static int factorial(int n) {
        if (n==1) {
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
    
    // Método para crear un arreglo recibiendo por teclado el tamaño
    public static void crearArreglo(int[] m){
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();
        m = new int[tam];
        insertarDatos(m);
        presentarArreglo(m);
        arreglo = m;
    }
    
    // Método para presentar los elementos de un arreglo
    public static void presentarArreglo(int[] m){
        for (int i=0; i<m.length; i++){
            System.out.print("["+m[i]+"]\t");
        }
        System.out.println();
    }
    
    // Método para insertar datos en un arreglo
    public static void insertarDatos(int[] m){
        for (int i=0; i<m.length; i++){
            System.out.print("Ingrese un valor en la posición ["+i+"]: ");
            m[i] = sc.nextInt();
        }
        System.out.println("--------------------------------------");
    }
    
}
