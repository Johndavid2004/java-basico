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

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            
            do {
                System.out.println("=======================================");
                System.out.println("         MENÚ PRINCIPAL - EJERCICIOS BÁSICOS   ");
                System.out.println("=======================================");
                for (int i = 1; i <= 29; i++) {
                    System.out.println(i + ".  Ejercicio " + i);
                }
                System.out.println("0.  Salir");
                System.out.println("=======================================");
                System.out.print("Seleccione una opción: ");
                
                // Validación de entrada numérica
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer después del número
                } else {
                    System.out.println("! Precaución, error... ¡: Ingrese un número válido.");
                    scanner.next();
                    continue;
                }
                
                // Ejecutar menú de opciones
                switch (opcion) {
                    // Repaso
                    case 1 -> Ejercicio1.ejecutar();
                    // Condicionales
                    case 2 -> Ejercicio2.ejecutar();
                    case 3 -> new Ejercicio3().ejecutar();
                    case 4 -> Ejercicio4.ejecutar();
                    case 5 -> Ejercicio5.ejecutar();
                    case 6 -> Ejercicio6.ejecutar();
                    // Switch - case
                    case 7 -> Ejercicio7.ejecutar();
                    case 8 -> Ejercicio8.ejecutar();
                    case 9 -> Ejercicio9.ejecutar();
                    case 10 -> Ejercicio10.ejecutar();
                    case 11 -> Ejercicio11.ejecutar();
                    // Bucle while
                    case 12 -> Ejercicio12.ejecutar();
                    case 13 -> Ejercicio13.ejecutar();
                    case 14 -> Ejercicio14.ejecutar();
                    case 15 -> Ejercicio15.ejecutar();
                    case 16 -> Ejercicio16.ejecutar();
                    case 17 -> Ejercicio17.ejecutar();
                    // Bucle do - while
                    case 18 -> Ejercicio18.ejecutar();
                    case 19 -> Ejercicio19.ejecutar();
                    case 20 -> Ejercicio20.ejecutar();
                    case 21 -> Ejercicio21.ejecutar();
                    case 22 -> Ejercicio22.ejecutar();
                    case 23 -> Ejercicio23.ejecutar();
                    // Bucle for
                    case 24 -> Ejercicio24.ejecutar();
                    case 25 -> Ejercicio25.ejecutar();
                    case 26 -> Ejercicio26.ejecutar();
                    case 27 -> Ejercicio27.ejecutar();
                    case 28 -> Ejercicio28.ejecutar();
                    case 29 -> Ejercicio29.ejecutar();
                    case 0 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida, intente de nuevo.");
                }
                
                // Agregar pausa antes de regresar al menú
                if (opcion != 0) {
                    System.out.println("\nPresione Enter para regresar al menú...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                }
                
            } while (opcion != 0);
        }
    }
}
