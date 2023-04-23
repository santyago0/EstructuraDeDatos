package practica001;

import java.util.Scanner;

public class CalcularICM {

    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA CALCULAR EL ICM \n");
        
        //Declaración de Variables
        Scanner teclado = new Scanner(System.in);
        String name;
        double peso, pesoKg, altura, alturaM, ICM, round;
        
        //Ingreso de Datos
        System.out.print("Ingrese su nombre: ");
        name = teclado.nextLine();
        System.out.print("Ingrese su peso en libras: ");
        peso = teclado.nextDouble();
        System.out.print("Ingrese su altura en cm: ");
        altura = teclado.nextDouble();
        
        //Procesos
        pesoKg = peso*0.45;
        alturaM = altura/100;
        ICM = pesoKg / (Math.pow(alturaM,2));
        round = Math.round(ICM*100.0)/100.0;
        
        //Salida de Datos
        System.out.println(name +" su ICM es: "+ round);
    }
    
}
