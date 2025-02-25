/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar scanner
import java.util.Scanner;
//Crear clase
public class Ejercicio18 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder biblioteca = new StringBuilder();
        String respuesta;

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("      REGISTRO DE BIBLIOTECA");
        System.out.println("=================================");
        System.out.println("=================================");
        
        //Bucle do - while
        do {
            String titulo = tomarTitulo(scanner);
            String autor = tomarAutor(scanner);
            int paginas = tomarPaginas(scanner);

            biblioteca.append(procesarLibro(titulo, autor, paginas));

            System.out.print("¿Desea registrar otro libro? (s/n): ");
            respuesta = scanner.next().toLowerCase();
        } while (respuesta.equals("s"));

        mostrarLibros(biblioteca.toString());
        scanner.close();
    }
    
    //Crear metodos
    //Tomar datos
    public static String tomarTitulo(Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        scanner.nextLine(); // Consumir el salto de línea
        return scanner.nextLine();
    }
    
    //Tomar datos
    public static String tomarAutor(Scanner scanner) {
        System.out.print("Ingrese el autor del libro: ");
        return scanner.nextLine();
    }
    
    //tomar datos
    public static int tomarPaginas(Scanner scanner) {
        System.out.print("Ingrese el número de páginas: ");
        return scanner.nextInt();
    }
    
    //Procesar datos
    public static String procesarLibro(String titulo, String autor, int paginas) {
        return String.format("Título: %s | Autor: %s | Páginas: %d%n", titulo, autor, paginas);
    }
    
    //Mostrar resultados
    public static void mostrarLibros(String biblioteca) {
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("      LIBROS REGISTRADOS");
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println(biblioteca.isEmpty() ? "No se registraron libros." : biblioteca);
    }
}