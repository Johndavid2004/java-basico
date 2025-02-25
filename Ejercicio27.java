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
public class Ejercicio27 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder agenda = new StringBuilder();
            
            System.out.println("====================================");
            System.out.println("📖 BIENVENIDO A LA AGENDA DE CONTACTOS");
            System.out.println("====================================");
            
            // Pedir cantidad de contactos
            System.out.print("Ingrese la cantidad de contactos que desea agregar: ");
            int cantidadContactos = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            // Bucle for para registrar contactos
            for (int i = 1; i <= cantidadContactos; i++) {
                Object[] contacto = tomarDatos(scanner, i);
                procesarDatos(agenda, contacto);
            }
            
            // Mostrar los contactos registrados
            mostrarResultados(agenda);
        }
    }

    public static Object[] tomarDatos(Scanner scanner, int numContacto) {
        System.out.printf("\nContacto #%d\n", numContacto);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de teléfono: ");
        String telefono = scanner.nextLine();

        return new Object[]{nombre, telefono};
    }

    public static void procesarDatos(StringBuilder agenda, Object[] contacto) {
        String nombre = (String) contacto[0];
        String telefono = (String) contacto[1];

        agenda.append("- ").append(nombre).append(": ").append(telefono).append("\n");
    }

    public static void mostrarResultados(StringBuilder agenda) {
        System.out.println("\n====================================");
        System.out.println("📋 LISTA DE CONTACTOS REGISTRADOS");
        System.out.println("====================================");
        System.out.println(agenda);
        System.out.println("✅ ¡Agenda guardada exitosamente!");
    }
}