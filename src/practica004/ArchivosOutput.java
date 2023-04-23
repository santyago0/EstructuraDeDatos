package practica004;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivosOutput {
    
    public static void main(String[] args) {
        //Crear archivo
        try{
            File file = new File("C:\\Users\\santy\\OneDrive\\Escritorio"
                    + "\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS\\ejemploBytes.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            }else {
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e) {
            System.out.println("Error");
        }
        
        //Escribir en el archivo
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\santy\\OneDrive"
                + "\\Escritorio\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                + "\\ejemploBytes.txt",true)) {
            String data = "Esto es un ejemplo con Bytes\n";
            byte b[] = data.getBytes();
            fos.write(b);
            fos.flush();
            fos.close();
            System.out.println("Se ha escrito en el archivo");
        }catch (IOException e) {
            System.out.println("Error de escritura");
        }
        
        //Leer contenido del archivo
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\santy\\OneDrive"
                + "\\Escritorio\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                + "\\ejemploBytes.txt");
            int i;
            while ((i = fis.read())!=-1) {
                System.out.print((char)i);
            }
        }catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
