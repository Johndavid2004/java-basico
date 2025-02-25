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
public class Ejercicio8 {
     public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("================================");
             System.out.println("   CALCULADORA DE IMC");
             System.out.println("================================");
             
             double peso = obtenerPeso(scanner);
             double altura = obtenerAltura(scanner);
             double imc = calcularIMC(peso, altura);
             String categoria = determinarCategoriaIMC(imc);
             
             mostrarResultados(imc, categoria);
         }
    }
    
    public static double obtenerPeso(Scanner scanner) {
        double peso;
        do {
            System.out.print("Ingrese su peso en kg: ");
            peso = scanner.nextDouble();
        } while (peso <= 0);
        return peso;
    }
    
    public static double obtenerAltura(Scanner scanner) {
        double altura;
        do {
            System.out.print("Ingrese su altura en metros: ");
            altura = scanner.nextDouble();
        } while (altura <= 0);
        return altura;
    }
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public static String determinarCategoriaIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
    
    public static void mostrarResultados(double imc, String categoria) {
        System.out.println("================================");
        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
    }
}
