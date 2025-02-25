/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================");
            System.out.println("   ASISTENTE VIRTUAL DE CINE");
            System.out.println("================================");
            
            int edad = obtenerEdad(scanner);
            String recomendacion = recomendarPelicula(edad);
            
            mostrarRecomendacion(recomendacion);
        }
    }
    
    public static int obtenerEdad(Scanner scanner) {
        int edad;
        do {
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
        } while (edad <= 0);
        return edad;
    }
    
    public static String recomendarPelicula(int edad) {
        return switch (edad) {
            case 0, 1, 2, 3, 4, 5, 6 -> "Recomendamos películas animadas y educativas aptas para todas las edades.";
            case 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 -> "Sugerimos películas familiares, animaciones, aventuras y comedias familiares.";
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> "Ofrecemos una variedad de géneros como acción, drama, comedia y ciencia ficción.";
            default -> "Recomendamos películas clásicas y dramas que pueden ser de su interés.";
        };
    }
    
    public static void mostrarRecomendacion(String recomendacion) {
        System.out.println("================================");
        System.out.println(recomendacion);
    }
}
