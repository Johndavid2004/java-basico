/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar
import java.util.Scanner;
//Crear clase
public class Ejercicio28 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" 🔢 SUMADOR DE NÚMEROS ");
            
            System.out.print(" Escribir la cantidad de números a sumar: ");
            int cantidad = scanner.nextInt();
            
            int sumaTotal = procesarDatos(scanner, cantidad);
            
            mostrarResultados(sumaTotal);
        }
    }
    
    //Crear metodos
    public static int procesarDatos(Scanner scanner, int cantidad) {
        int suma = 0;
        
        for (int i = 1; i <= cantidad; i++) {
            int numero = tomarNumero(scanner, i);
            suma += numero;
        }
        
        return suma;
    }

    public static int tomarNumero(Scanner scanner, int indice) {
        int numero;
        
        while (true) {
            System.out.printf("Ingrese el número #%d: ", indice);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break; // Salir del bucle si el número es válido
            } else {
                System.out.println("⚠ Error: Ingrese un número válido.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }
        
        return numero;
    }

    public static void mostrarResultados(int sumaTotal) {
        System.out.println("✅ Resultado: La suma total es " + sumaTotal);
    }
}
