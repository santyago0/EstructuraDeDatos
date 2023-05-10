package taller01;

import static taller01.Metodos.*;

/**
 *
 * @author santy
 */
public class Arreglo {
    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanio = sc.nextInt();
        crearArreglo(tamanio);
        System.out.println("=========================================");
        ingresarDatos(obtenerArreglo());
        System.out.println("=========================================");
        boolean interruptor = true;
        while (interruptor == true){
            System.out.println("ELIJA UNA OPCIÓN (1-5):\n"
                + "1) Presentar el arreglo\n2) Buscar un elemento\n"
                + "3) Eliminar un elemento\n4) Ordenar con el método Burbuja\n"
                + "5) Oredenar el elemento con el método Quick Sort\n"
                + "6) Salir");
            System.out.println("=========================================");
            System.out.print("Opción: ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    presentarArreglo(obtenerArreglo());
                    System.out.println("==================================="
                            + "======");
                    break;
                case 2:
                    System.out.print("Ingrese el elemento que desea "
                            + "buscar: ");
                    int buscar = sc.nextInt();
                    System.out.print("El elemento se encuentra en la "
                            + "posición ["+buscarElemento(obtenerArreglo()
                            , buscar)+"]\n");
                    System.out.println("==================================="
                            + "======");
                    break;
                case 3:
                    System.out.print("Ingrese el elemento que desea "
                            + "eliminar: ");
                    int eliminar = sc.nextInt();
                    eliminarElemento(obtenerArreglo(), eliminar);
                    presentarArreglo(obtenerArreglo());
                    System.out.println("==================================="
                            + "======");
                    break;
                case 4:
                    System.out.println("Arreglo ordenado con el Método "
                            + "Burbuja:");
                    metodoBurbuja(obtenerArreglo());
                    presentarArreglo(obtenerArreglo());
                    System.out.println("==================================="
                            + "======");
                    break;
                case 5:
                    System.out.println("Arreglo ordenado con el Método "
                            + "QuickSort:");
                    metodoQuickSort(obtenerArreglo(),0,
                            obtenerArreglo().length-1);
                    presentarArreglo(obtenerArreglo());
                    System.out.println("==================================="
                            + "======");
                    break;
                case 6:
                    System.out.println("Programa finalizado...");
                    interruptor = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("==================================="
                            + "======");
            }
        }
        /*
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanio = sc.nextInt();
        crearArreglo(tamanio);
        
        System.out.println("=========================================");
        ingresarDatos(obtenerArreglo());
        System.out.println("=========================================");
        presentarArreglo(obtenerArreglo());
        System.out.println("=========================================");
        
        System.out.println("Arreglo ordenado con el Método Burbuja:");
        metodoBurbuja(obtenerArreglo());
        presentarArreglo(obtenerArreglo());
        System.out.println("\nArreglo ordenado con el Método QuickSort:");
        metodoQuickSort(obtenerArreglo(),0,obtenerArreglo().length-1);
        presentarArreglo(obtenerArreglo());
        
        System.out.println("=========================================");
        System.out.print("Ingrese el elemento que desea buscar: ");
        int buscar = sc.nextInt();
        System.out.print("El elemento se encuentra en la posición ["+
                buscarElemento(obtenerArreglo(), buscar)+"]\n");
        System.out.println("=========================================");
        System.out.print("Ingrese el elemento que desea eliminar: ");
        int eliminar = sc.nextInt();
        eliminarElemento(obtenerArreglo(), eliminar);
        System.out.println("=========================================");
        presentarArreglo(obtenerArreglo());
        System.out.println("=========================================");
        
        System.out.println("Arreglo ordenado con el Método Burbuja:");
        metodoBurbuja(obtenerArreglo());
        presentarArreglo(obtenerArreglo());
        System.out.println("\nArreglo ordenado con el Método QuickSort:");
        metodoQuickSort(obtenerArreglo(),0,obtenerArreglo().length-1);
        presentarArreglo(obtenerArreglo());
        */
    }
    
}
