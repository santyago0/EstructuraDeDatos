package metodosArreglos;

import static metodosArreglos.Meto2.*;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class MiArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miArreglo[] = new int [dimension()];
        
        insertarDatos(miArreglo);
        
        presentarArreglo(miArreglo);
        
        System.out.print("Ingrese el elemento que desea buscar: ");
        int search = sc.nextInt();
        System.out.println(busquedaSecuencial(miArreglo,search));
        
        System.out.print("Ingrese el elemento que desea eliminar: ");
        int delete = sc.nextInt();
        eliminarElemento(miArreglo,delete);
        
        presentarArreglo(miArreglo);
    }
}
