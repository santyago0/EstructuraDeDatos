package problema01;
/*  
    Una empresa tiene 4 productos diferentes. En una matriz se almacena las ventas 
    de los cuatro productos en los 12 meses. Crear un programa que calcule:

    a. El producto con mayor venta. Indique la cantidad vendida.
    b. El mes en que más se vendió los cuatro productos. Indique lo vendido en el mes.
    c. El mes que menos se vendió los cuatro productos. Indique lo vendido en el mes.
*/

import java.util.Scanner;
import static problema01.Metodos.*;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Declaracion de Variables y Objetos
        Scanner lm = new Scanner(System.in);

        // Creacion de la Matriz 
        int array[][] = new int [4][12];

        // Presentacion del Programa
        System.out.println("====================================");
        System.out.println("Estadisticas de Ventas de la Empresa");
        System.out.println("====================================");

        // Ingreso de Datos 
        for(byte pdt = 0; pdt < array.length; pdt++){
            System.out.println("\n ---Ventas del Producto N°" + (pdt +1)+"---\n");
            for(byte mes = 0; mes < array[pdt].length; mes++){
                System.out.print("Ingrese las ventas del producto en el mes [" + (mes + 1) + "]: ");
                array[pdt][mes] = lm.nextInt();
            }
        }

        // LLama de los Metodos
        System.out.println("\n==============================================="
                + "=====\n");
        mayorVenta(array);
        mesMayorVenta(array);
        mesMenorVenta(array);
    }

}
