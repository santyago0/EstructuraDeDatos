package practica003;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosWriter {
    
    public static void main(String[] args) {
        //Crear archivo
        try{
            File file = new File("C:\\Users\\santy\\OneDrive\\Escritorio"
                    + "\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS\\ejemplo.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            }else {
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e) {
            System.out.println("Error");
        }
        
        //Escribir en el archivo
        try (FileWriter myWriter = new FileWriter("C:\\Users\\santy\\OneDrive"
                + "\\Escritorio\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                + "\\ejemplo.txt",true)) {
            myWriter.write("Ejemplo de escritura en archivo usando Writer\n");
            //.append para escribir más líneas
            myWriter.append("Ejemplo de escritura en archivo usando .append\n");
            myWriter.close();
            System.out.println("El archivo ha sido escrito");
        }catch (IOException e) {
            System.out.println("Error de escritura");
        }
        
        //Leer contenido del archivo
        System.out.println("Leemos el archivo");
        try (FileReader myReader = new FileReader("C:\\Users\\santy\\OneDrive"
                + "\\Escritorio\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                + "\\ejemplo.txt")) {
            int i;
            while ((i = myReader.read())!=-1) {
                System.out.print((char)i);
            }
        }catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
