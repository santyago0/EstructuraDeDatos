package practica002;

public class SubcadenaTexto {
    
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA EXTRAER UNA SUBCADENA DE TEXTO\n");
        
        //Declaración de Variables
        int index, index1;
        String cadena;
        String utpl = "La #Universidad Técnica Particular de Loja# tiene dos modalidades de estudios";
        
        //Proceso
        index = utpl.indexOf((int)'#');
        index1 = utpl.lastIndexOf((int)'#');
        
        //Salida de Datos
        System.out.println(index);
        System.out.println(index1);
        cadena = utpl.substring(index+1,index1);
        System.out.println(cadena);
    }
}
