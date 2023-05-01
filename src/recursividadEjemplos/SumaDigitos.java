package recursividadEjemplos;

import java.util.Scanner;

public class SumaDigitos {
    
    //Método recursivo para encontrar la suma d elos dígitos de un número
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }else {
            //Separa los dígitos, y se vuelve a llamar a la función
            return (n%10) + sumaDigitos(n/10);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("La suma de los dígitos de " + n + " es: " + sumaDigitos(n));
    }
}
