package resolucionProblema;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creación del objeto de tipo Cola
        Cola cola = new Cola(10);
        
        // Codigo para la resolución del problema con un menú de opciones
        boolean interruptor = true;
        int tickets = 1;
        while (interruptor){
            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("1. Asignación de tickets: ");
            System.out.println("2. Cliente atendido: ");
            System.out.println("3. Conocer los tickets que hay en la sala: ");
            System.out.println("4. Salir del Programa: ");
            System.out.print("\nElija su opción -> ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    if(tickets <= 100 && !cola.colaLlena()){
                        System.out.print("\nSu número de ticket es: ["+tickets+
                                "]\n");
                        cola.insertarCola(tickets);
                        tickets++;
                    }else{
                        System.out.print("\nSala llena, espere su turno...\n");
                    }
                    System.out.println("");
                    break;
                case 2:
                    cola.eliminarCola();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\nSala: ");
                    cola.presentarColaTope();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa...");
                    interruptor = false;
                    System.out.println("");
                    break;
                default:
                    System.out.println("\nOpción no válida");
                    System.out.println("");
            }
        }
    }
    
}
