/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelofibonacci;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ModeloFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========MENU=====");
            System.out.println("1. Devolver numero de Fibonacci para un pocision dada  ");
            System.out.println("2. Devolver posicion de un numero en la serie de Fibonacci  ");
            System.out.println("3. Obtener secuencia de Fibonacci");
            System.out.println("4. Salir");
            System.out.println("================================================");
            System.out.print("Ingrese su opcion=====> ");

            int option = scanner.nextInt();
            System.out.println("================================================");

            switch (option) {
                case 1:
                    System.out.print("Ingrese el indice para obtener el numero de Fibonacci ====> ");
                    int index = scanner.nextInt();
                    long fibNumber = fibonacci.getFibonacciNumber(index);
                    System.out.println("El numero de Fibonacci en la posicion " + index + " es ===> " + fibNumber);
                    break;
                case 2:
                    System.out.print("Ingrese el numero para obtener su posicion en la serie de Fibonacci: ");
                    long number = scanner.nextLong();
                    int position = fibonacci.getFibonacciPosition(number);
                    if (position != -1) {
                        System.out.println("El numero " + number + " se encuentra en la posicion " + position + " de la serie de Fibonacci.");
                    } else {
                        System.out.println("El numero " + number + " no esta en la serie de Fibonacci.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad para obtener los valores de la secuencia de Fibonacci ===> ");
                    int valuesIndex = scanner.nextInt();
                    System.out.println("Valores de la secuencia de Fibonacci===> ");
                    List<Long> valuesSequence = fibonacci.getFibonacciSequence(valuesIndex);
                    for (long fib : valuesSequence) {
                        System.out.print(fib + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("=====GRACIAS======");
                    System.exit(0);
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }

    }
}
