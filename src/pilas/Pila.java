package pilas;

/**
 *
 * @author santy
 */
public class Pila {
    public static void main(String[] args) {
        PilaArray pila = new PilaArray(6);
        
        // Insertar datos en la pila
        pila.insertarPila();
        pila.insertarPila();
        
        // Presentar los elementos de la pila
        pila.presentarPilaMax();
        
        // Eliminar un elemento de la pila
        pila.eliminarPila();
        
        pila.presentarPilaTope();
    }
    
}
