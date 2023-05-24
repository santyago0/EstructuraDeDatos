package resolucionProblema;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Cola {
    int[] cola;
    int tope;
    int max;
    Scanner sc = new Scanner(System.in);
    
    // Constructor para los valores de la pila
    public Cola(int x){
        this.tope = -1;
        this.max = x;
        this.cola = new int[x];
    }
    
    public int obtenerTope(){
        return tope;
    }
    
    public void vaciarCola(){
        this.tope = -1;
    }
    
    public boolean colaLlena(){
        if (this.max-1 == this.tope){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean colaVacia(){
        if (this.tope == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarCola(int x){
        if (this.colaLlena()){
            System.out.println("Sala llena, espere su turno...");
        }else{
            // int item;
            // System.out.print("Ingrese item a insertar: ");
            // item = sc.nextInt();
            this.tope++;
            this.cola[this.tope] = x;
            // System.out.println("El item "+item+" se ha insertado");
        }
    }
    
    public void eliminarCola(){
        if (this.colaVacia()){
            System.out.println("Sala vacia");
        }else{
            int item = this.cola[0];
            System.out.println("\nEl cliente "+item+" ha sido atendido");
            if (this.tope == 0){
                vaciarCola();
            }else{
                for (int i=0; i<this.tope; i++){
                    this.cola[i] = this.cola[i+1];
                }
            }
            this.tope--;
        }
    }
    
    // Método para mostrar los datos de la pila hasta el tope
    public void presentarColaTope(){
        System.out.print("[ ");
        for (int i=0; i<=this.tope; i++){
            System.out.print(+this.cola[i]+" ");
        }
        System.out.println("]");
    }
    
    // Método para mostrar los datos de la pila hasta el máximo
    public void presentarColaMax(){
        for (int i=0; i<this.max; i++){
            System.out.print(this.cola[i]+"\t");
        }
        System.out.println();
    }
    
}
