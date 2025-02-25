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

//Crear clase
public class Ejercicio22 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("       REGISTRO DE EXÁMENES");
        System.out.println("=================================");
        System.out.println("=================================");
        
        //Bucle do - while
        do {
            nota = tomarNota(scanner);
            sumaNotas += nota;
            cantidadNotas++;

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
        } while (scanner.next().toLowerCase().equals("s"));

        double promedio = calcularPromedio(sumaNotas, cantidadNotas);
        mostrarResultado(promedio);

        scanner.close();
    }
    
    //Crear metodos
    //Tomar datos
    public static double tomarNota(Scanner scanner) {
        double nota;
        do {
            System.out.print(" Escribe la nota del examen (0 - 10): ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("⚠ Error: La nota debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
    
    //procesar datos
    public static double calcularPromedio(double sumaNotas, int cantidadNotas) {
        return sumaNotas / cantidadNotas;
    }
    
    //Mostrar resultados
    public static void mostrarResultado(double promedio) {
        System.out.println("=================================");
        System.out.printf("📊 Promedio Final: %.2f\n", promedio);
        if (promedio >= 6) {
            System.out.println("✅ ¡Felicidades! Has aprobado.");
        } else {
            System.out.println("❌ Lo sentimos. Has reprobado.");
        }
    }
}