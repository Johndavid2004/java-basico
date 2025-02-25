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
public class Ejercicio16 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================");
            System.out.println("       CUENTA REGRESIVA");
            System.out.println("================================");
            
            //Atributos
            int numero = tomarNumero(scanner);
            procesarCuentaRegresiva(numero);
            mostrarMensajeFinal();
        }
    }
    
    //Crear metodos
    //Tomar datos
    public static int tomarNumero(Scanner scanner) {
        int numero;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);
        return numero;
    }
    
    //Procesar datos
    public static void procesarCuentaRegresiva(int numero) {
        System.out.println("Iniciando cuenta regresiva:");
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre números
            } catch (InterruptedException e) {
                System.out.println("Error en la cuenta regresiva.");
            }
        }
    }
    
    //Mostrar resultados
    public static void mostrarMensajeFinal() {
        System.out.println("!Felicidades¡ , ¡Tiempo cumplido!");
    }
}
