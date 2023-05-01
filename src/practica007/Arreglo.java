package practica007;

import java.util.Scanner;

public class Arreglo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        char myChar[] = {'a','b','c'};
        String[] cars = {"Volvo","BMW"};
        
        //Presentar el arreglo
        for(int i=0; i<myArray.length; i++) {
            System.out.print("\nDato [" + i + "]: ");
            myArray[i] = sc.nextInt();
        }
        System.out.println();
        presentarArray(myArray);
        //for(int i=0; i<myArray.length; i++) {
        //    System.out.print(myArray[i] + "\t");
        //}
        System.out.println();
        
        //Buscar en el arreglo
        System.out.print("Ingres el valor a buscar: ");
        int n = sc.nextInt();
        System.out.println(buscarElemento(myArray, n));
        
        //Eliminar elemento del arreglo
        System.out.print("Ingrese el valor a eliminar: ");
        int delete = sc.nextInt();
        eliminarElemento(myArray, delete);
        
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        
    }
    
    public static void presentarArray(int array[]) {
            for(int i=0; i<array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    
    public static int buscarElemento(int[] array, int elemento) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    
    public static void eliminarElemento(int[] array, int indice) {
        if(indice!=-1) {
            int i = indice;
            for(; i<array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[i] = 0;
        }
    }
    
    //public static void eliminarElemento(int[] array, int delete) {
    //    for(int i=0; i<array.length-1; i++) {
    //        if(array[i]==delete) {    
    //            array[i] = array[i+1];
    //        }
    //    }
    //}
}
