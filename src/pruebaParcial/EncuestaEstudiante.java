package pruebaParcial;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EncuestaEstudiante {
    public static void main(String[] args) {
        // Preguntas de la encuesta:
        // Ingrese núemro de cédula
        // ¿Ingrese sus nombres y apellidos?
        // ¿Cuál es su edad?
        // ¿Ingrese el número de asignaturas que esta cursando en el presente ciclo?
        // ¿Está satisfecho con la carrera?
    
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes van a ser encuestados? ");
        int numEstudiantes = sc.nextInt();
        // Crear el archivo
        try{
            File file = new File("C:\\Users\\santy\\OneDrive\\Escritorio"
                    + "\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                    + "\\Estudiantes.txt");
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
                + "\\Estudiantes.txt")) { // ,true
            for(int i=1; i<=numEstudiantes; i++){
                String nEstudiante = "Estudiante "+i+":";
                System.out.println("--------------------------------------");
                System.out.println(nEstudiante+"\n");
                String pregunta1 = "Ingrese núemro de cédula:";
                System.out.println(pregunta1);
                String respuesta1 = sc.next();
                sc.nextLine();
                String pregunta2 = "¿Ingrese sus nombres y apellidos?";
                System.out.println(pregunta2);
                String respuesta2 = sc.nextLine();
                String pregunta3 = "¿Cuál es su edad?";
                System.out.println(pregunta3);
                String respuesta3 = sc.nextLine();
                String pregunta4 = "¿Ingrese el número de asignaturas que esta "
                        + "cursando en el presente ciclo?";
                System.out.println(pregunta4);
                String respuesta4 = sc.nextLine();
                String pregunta5 = "¿Está satisfecho con la carrera?";
                System.out.println(pregunta5);
                String respuesta5 = sc.next();
                myWriter.write(nEstudiante+"\n");
                myWriter.append("1) "+pregunta1+"\n");
                myWriter.append("\t"+respuesta1+"\n\n");
                myWriter.append("2) "+pregunta2+"\n");
                myWriter.append("\t"+respuesta2+"\n\n");
                myWriter.append("3) "+pregunta3+"\n");
                myWriter.append("\t"+respuesta3+"\n\n");
                myWriter.append("4) "+pregunta4+"\n");
                myWriter.append("\t"+respuesta4+"\n\n");
                myWriter.append("5) "+pregunta5+"\n");
                myWriter.append("\t"+respuesta5+"\n\n\n\n");
            }
            myWriter.close();
            System.out.println("==========================================");
            System.out.println("El archivo ha sido escrito");
        }catch (IOException e) {
            System.out.println("Error de escritura");
        }

        //Leer contenido del archivo
        System.out.println("==========================================");
        System.out.println("Leemos el archivo");
        System.out.println("==========================================");
        try (FileReader myReader = new FileReader("C:\\Users\\santy\\OneDrive"
                + "\\Escritorio\\COMPUTACIÓN - 2do Semestre\\ESTUCTURA DE DATOS"
                + "\\Estudiantes.txt")) {
            int f;
            while ((f = myReader.read())!=-1) {
                System.out.print((char)f);
            }
        }catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
