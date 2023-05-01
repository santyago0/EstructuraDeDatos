package practica006;

import java.util.Scanner;

public class Palindromo {
    
    public static boolean palindromo(String palabra) {
        if (palabra.length()==0 || palabra.length()==1) {
            return true;
        }if (palabra.charAt(0)== palabra.charAt((palabra.length()-1))) {
            return palindromo(palabra.substring(1,palabra.length()-1));
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una palabra: ");
        String palabra = sc.next();
        boolean flag = palindromo(palabra);
        System.out.println(flag);
    }
}
