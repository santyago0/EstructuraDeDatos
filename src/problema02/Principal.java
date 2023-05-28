package problema02;
/*
    Dada una matriz de tamaño NxN (impar), realice un método que me permita 
    mostrar una pirámide de asteriscos, ejemplo:
        [-] [-] [-] [-] [-]
        [-] [-] [-] [-] [-]
        [-] [-] [*] [-] [-]
        [-] [*] [*] [*] [-]
        [*] [*] [*] [*] [*]
*/

import java.util.Scanner;
import static problema02.Metodos.*;

/**
 *
 * @author santy
 */
public class Principal {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        String piramide [][];
        int tamanio;
        
        // Presentacion del Programa
        System.out.println("====================================");
        System.out.println("Pirámide de asterísticos");
        System.out.println("====================================");
        
        // Pedir el tamño de la matriz para que sea cuadrática e impar
        while (true){
            System.out.print("Ingrese el tamaño de la matriz: ");
            tamanio = sc.nextInt();
            if (tamanio%2 != 0){
                piramide = new String[tamanio][tamanio];
                crearPiramide(piramide);
                System.out.print("\n");
                presentarPiramide(piramide);
                break;
            }else{
                System.out.println("\nLa matriz debe tener un tamaño impar, "
                        + "intentelo otra vez\n");
            }
        }
    }
    
}
