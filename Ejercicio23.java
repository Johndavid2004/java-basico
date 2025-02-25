/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar Scanner
import java.util.Scanner;

//Crear Clase
public class Ejercicio23 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaTareas = new StringBuilder();
        int contador = 1;
        String respuesta;

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("      GESTIÓN DE TAREAS");
        System.out.println("=================================");
        System.out.println("=================================");
        
        //Bucle do - whle
        do {
            // Tomar datos de la tarea
            String[] datosTarea = tomarDatos(scanner);

            // Procesar y acumular datos
            procesarDatos(listaTareas, datosTarea, contador);
            contador++;

            // Preguntar si desea agregar otra tarea
            System.out.print("¿Desea agregar otra tarea? (s/n): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("s"));

        // Mostrar resultados
        mostrarResultados(listaTareas);
        scanner.close();
    }

    //Crear metodos
    public static String[] tomarDatos(Scanner scanner) {
        System.out.print(" Usuario. Escriba el nombre de la tarea: ");
        String tarea = scanner.nextLine();

        System.out.print("Usuario. Escriba la descripción de la tarea: ");
        String descripcion = scanner.nextLine();

        System.out.print("Usuario. Escriba la fecha de vencimiento (DD/MM/AAAA): ");
        String fechaVencimiento = scanner.nextLine();

        return new String[]{tarea, descripcion, fechaVencimiento};
    }

    public static void procesarDatos(StringBuilder listaTareas, String[] datosTarea, int contador) {
        listaTareas.append(contador).append(". Tarea: ").append(datosTarea[0])
                  .append("\n   Descripción: ").append(datosTarea[1])
                  .append("\n   Fecha de vencimiento: ").append(datosTarea[2])
                  .append("\n-----------------------------------\n");
    }

    public static void mostrarResultados(StringBuilder listaTareas) {
        System.out.println("\n=================================");
        System.out.println("\n=================================");
        System.out.println("📌 LISTA DE TAREAS REGISTRADAS");
        System.out.println("=================================");
        System.out.println("\n=================================");
        if (listaTareas.length() > 0) {
            System.out.println(listaTareas);
        } else {
            System.out.println("No se registraron tareas.");
        }
    }
}
