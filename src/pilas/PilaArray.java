package pilas;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PilaArray {
    int[] pila;
    int tope;
    int max;
    Scanner sc = new Scanner(System.in);
    
    // Constructor para los valores de la pila
    public PilaArray(int x){
        this.tope = -1;
        this.max = x;
        this.pila = new int[x];
    }
    
    public int obtenerTope(){
        return tope;
    }
    
    public void vaciarPila(){
        this.tope = -1;
    }
    
    public boolean pilaLlena(){
        if (this.max-1 == this.tope){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean pilaVacia(){
        if (this.tope == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarPila(){
        if (this.pilaLlena()){
            System.out.println("Pila llena");
        }else{
            int item;
            System.out.print("Ingrese item a insertar: ");
            item = sc.nextInt();
            this.tope++;
            this.pila[this.tope] = item;
            System.out.println("El item "+item+" se ha insertado");
        }
    }
    
    public void eliminarPila(){
        if (this.pilaVacia()){
            System.out.println("Pila vacia");
        }else{
            int item = this.pila[this.tope];
            this.tope--;
            System.out.println("El item "+item+" se ha eliminado");
        }
    }
    
    // Método para mostrar los datos de la pila hasta el tope
    public void presentarPilaTope(){
        for (int i=0; i<=this.tope; i++){
            System.out.print(this.pila[i]+"\t");
        }
        System.out.println();
    }
    
    // Método para mostrar los datos de la pila hasta el máximo
    public void presentarPilaMax(){
        for (int i=0; i<this.max; i++){
            System.out.print(this.pila[i]+"\t");
        }
        System.out.println();
    }
    
}
