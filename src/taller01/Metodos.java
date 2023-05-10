package taller01;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Metodos {
    // Variable globales de tipo Scanner y un arreglo con un tamaño base
    static Scanner sc = new Scanner(System.in);
    static int miArreglo[] = new int[0];
    
    // Método para crear un arreglo
    public static void crearArreglo(int x){
        miArreglo = new int[x];
    }
    
    public static int[] obtenerArreglo(){
        return miArreglo;
    }
    
    // Método para ingresar datos en el arreglo
    public static void ingresarDatos(int x[]){
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i=0; i<obtenerArreglo().length; i++){
            System.out.print("Ingresar elemento de posición ["+i+"]: ");
           x[i] = sc.nextInt();
        }
    }
    
    // Método para presentar los elementos del arreglo
    public static void presentarArreglo(int [] x){
        for (int i=0; i<x.length; i++){
            System.out.print("["+x[i]+ "]" +"\t");
        }
        System.out.println();
    }
    
    // Método para buscar un elemento del arreglo
    public static int buscarElemento(int [] x,int n){
        for (int i=0; i<x.length; i++){
            if(x[i] == n){
                return i;
            }
        }
        return -1;
    }
    
    // Método para eliminar un elemento del arreglo
    public static void eliminarElemento(int [] x, int n){
        int posicion = buscarElemento(x, n);
        if (posicion != -1){
            for(int i=posicion; i<x.length-1; i++){
                x[i] = x[i+1];
                x[i+1] = 0;
            }
            //x[x.length-1] = 0;
        }else
            System.out.println("El elemento no existe...");
    }
    
    // Método para ordenar el arreglo con el método Burbuja
    public static void metodoBurbuja(int x[]){
        int aux;
        for (int i=1; i<x.length; i++){
            for(int j=0; j<x.length-i; j++){
                if(x[j]>x[j+1]){
                    aux = x[j];
                    x[j] = x[j+1];
                    x[j+1] = aux;
                }
            }
        }
    }
    
    // Método para ordenar el arreglo con el método
    public static void metodoQuickSort(int x[], int inicio, int fin){
        if (inicio<fin){
            int particionIndice = particion(x, inicio, fin);
            metodoQuickSort(x, inicio, particionIndice-1);
            metodoQuickSort(x, particionIndice+1, fin);
        }
    }
    
    private static int particion(int x[], int inicio, int fin){
        int pivote = x[fin];
        int i = (inicio-1);
        for (int j=inicio; j<fin; j++){
            if (x[j]<=pivote){
                i++;
                int cambio = x[i];
                x[i] = x[j];
                x[j] = cambio;
            }
        }
        int cambio = x[i+1];
        x[i+1] = x[fin];
        x[fin] = cambio;
        return i+1;
    }
    
}
