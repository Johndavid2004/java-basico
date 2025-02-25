/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar scanner y random
import java.util.Scanner;
import java.util.Random;
//Crear clase
public class Ejercicio17 {
   public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("================================");
        System.out.println("     JUEGO DE ADIVINANZA");
        System.out.println("================================");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");
        
        //Bucle while
        while (true) {
            intento = tomarNumero(scanner);
            if (procesarIntento(intento, numeroSecreto)) {
                break;
            }
        }

        mostrarMensajeFinal();
        scanner.close();
    }
    
    //Crear metodos
    //Tomar datos
    public static int tomarNumero(Scanner scanner) {
        System.out.print("Ingresa tu número: ");
        return scanner.nextInt();
    }
    
    //Procesar datos
    public static boolean procesarIntento(int intento, int numeroSecreto) {
        if (intento < numeroSecreto) {
            System.out.println("El número es mayor. !Inténtalo de nuevo¡.");
        } else if (intento > numeroSecreto) {
            System.out.println("El número es menor. 1Inténtalo de nuevo¡.");
        } else {
            System.out.println("¡Felicidades! Has adivinado el número.");
            return true;
        }
        return false;
    }
    
    //Mostrat resultados
    public static void mostrarMensajeFinal() {
        System.out.println("Gracias por jugar. ¡Regresa pronto!");
    }
}
