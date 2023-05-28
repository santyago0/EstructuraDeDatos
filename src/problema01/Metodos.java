package problema01;

/**
 *
 * @author santy
 */
public class Metodos {
    // Método para encontrar el producto con mayor venta
    public static void mayorVenta(int a[][]){
        int mayorVenta = 0;
        int producto = 0;
        for (byte i=0; i<a.length; i++){
            int sumaVenta = 0;
            for (byte j=0; j<a[i].length; j++){
                sumaVenta += a[i][j];
            }
            if (sumaVenta > mayorVenta){
                mayorVenta = sumaVenta;
                producto = i+1;
            }
        }
        System.out.println("El produnto con mayor venta fue el producto "
                + "Nº"+producto+", que vendió una cantidad de "+mayorVenta+
                " productos\n");
    }
    
    // Método para encontrar el mes dónde más productos se vendió
    public static void mesMayorVenta(int a[][]){
        // Se crea una matriz traspuesta de a
        int aTrp [][] = new int[a[0].length][a.length]; 
        for (byte i=0; i<a.length; i++){
            for (byte j=0; j<a[i].length; j++){
                aTrp [j][i] = a[i][j];
            }
        }
        int mayorVenta = 0;
        int mes = 0;
        for (byte i=0; i<aTrp.length; i++){
            int sumaVenta = 0;
            for (byte j=0; j<aTrp[i].length; j++){
                sumaVenta += aTrp[i][j];
            }
            if (sumaVenta > mayorVenta){
                mayorVenta = sumaVenta;
                // Al crear la matriz traspuesta el indice [i] nos sirve para
                // poder numerar el mes con las mayores ventas
                mes = i+1;
            }
        }
        System.out.println("El mes "+mes+" fue cuando se vendió más productos, "
                + "con una cantidad de "+mayorVenta+" productos\n");
    }
    
    // Método para encontrar el mes dónde menos productos se vendió
    public static void mesMenorVenta(int a[][]){
        // Se crea una matriz traspuesta de a
        int aTrp [][] = new int[a[0].length][a.length]; 
        for (byte i=0; i<a.length; i++){
            for (byte j=0; j<a[i].length; j++){
                aTrp [j][i] = a[i][j];
            }
        }
        // Se crea una matriz auxiliar
        int aux [] = new int [aTrp.length];
        int menorVenta;
        int mes = 0;
        for (byte i=0; i<aTrp.length; i++){
            int sumaVenta = 0;
            for (byte j=0; j<aTrp[i].length; j++){
                sumaVenta += aTrp[i][j];
            }
            aux [i] = sumaVenta;
        }
        // La matriz auxiliar nos sirve para almacenar las sumas de la
        // cantidad de productos vendidos para encontrar la menor
        menorVenta = aux[0];
        for (byte i=0; i<aux.length; i++){
            if (aux[i] <= menorVenta){
                menorVenta = aux[i];
                // Al crear la matriz traspuesta el indice [i] nos sirve para
                // poder numerar el mes con las menores ventas
                mes = i+1;
            }
        }
        System.out.println("El mes "+mes+" fue cuando se vendió menos productos,"
                + " con una cantidad de "+menorVenta+" productos\n");
    }
    
}
