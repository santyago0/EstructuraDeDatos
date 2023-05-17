package pruebaParcial2;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class CalcularElementos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("======[CREACIÓN DE UN ARREGLO]======\n");
       crearArreglo();
       
    }
    
    // Método para crear un arreglo recibiendo por teclado el tamaño
    public static void crearArreglo(){
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();
        int [] arreglo = new int[tam];
        insertarDatos(arreglo);
        presentarArreglo(arreglo);
        System.out.print("\nNúmero de elementos negativos: "
                +calcularNegativos(arreglo));
        System.out.print("\nNúmero de ceros: "
                +calcularCeros(arreglo));
        System.out.print("\nNúmero de elementos positivos: "
                +calcularPositivos(arreglo)+"\n");
    }
    
    // Método para insertar datos en un arreglo
    public static void insertarDatos(int[] m){
        for (int i=0; i<m.length; i++){
            System.out.print("Ingrese un valor en la posición ["+i+"]: ");
            m[i] = sc.nextInt();
        }
        System.out.println("--------------------------------------");
    }
    
    // Método para presentar los elementos de un arreglo
    public static void presentarArreglo(int[] m){
        for (int i=0; i<m.length; i++){
            System.out.print("["+m[i]+"]\t");
        }
        System.out.println();
    }
    
    //Método para calcular cuantos números negativos hay en un arreglo
    public static int calcularNegativos(int[] m){
        int negativos = 0;
        for (int i=0; i<m.length; i++){
            if (m[i]<0){
                negativos++;
            }
        }
        return negativos;
    }
    
    //Método para calcular cuantos ceros hay en un arreglo
    public static int calcularCeros(int[] m){
        int ceros = 0;
        for (int i=0; i<m.length; i++){
            if (m[i]==0){
                ceros++;
            }
        }
        return ceros;
    }
    
    //Método para calcular cuantos números positivos hay en un arreglo
    public static int calcularPositivos(int[] m){
        int positivos = 0;
        for (int i=0; i<m.length; i++){
            if (m[i]>0){
                positivos++;
            }
        }
        return positivos;
    }
    
}
