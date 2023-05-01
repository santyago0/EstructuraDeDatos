package recursividadEjemplos;

import java.util.Scanner;

public class Factorial {
    
    //Método recursivo para encontrar el factorial de un número
    public static int factorial(int n) {
        if (n==1) {
            return 1;
        }else {
            //Se llama a si misma la función, con el valor de n-1
            return n * factorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
