package practica005;

import java.util.Scanner;

public class SumaRecursiva {
    
    public static int suma(int n) {
        if (n==1) {
            return 1;
        }else {
            return n + suma(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("El resultado es: " + suma(n));
    }
}
