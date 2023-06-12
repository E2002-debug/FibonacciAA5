/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelofibonacci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @Estefania Cale
 */
public class Fibonacci {

    private HashMap<Integer, Long> fibonacciMap;

    public Fibonacci() {
        fibonacciMap = new HashMap<>();
        fibonacciMap.put(0, 0L);
        fibonacciMap.put(1, 1L);
    }
//metodo recursivo
    public long getFibonacciNumber(int n) {
        if (fibonacciMap.containsKey(n)) {
            return fibonacciMap.get(n);
        } else {
            long fibValue = getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
            fibonacciMap.put(n, fibValue);
            return fibValue;
        }

    }

    public int getFibonacciPosition(long num) {
        if (num == 1) {
            return 1;
        }

        if (num == 1) {
            return 1;
        }

        int position = 2;
        long fibMinusTwo = 0;
        long fibMinusOne = 1;
        long fibValue = fibMinusOne + fibMinusTwo;

        while (fibValue < num) {
            fibMinusTwo = fibMinusOne;
            fibMinusOne = fibValue;
            fibValue = fibMinusOne + fibMinusTwo;
            position++;
        }

        if (fibValue == num) {
            return position;
        } else {
            return -1; // El número no está en la serie de Fibonacci si es menor a -1
        }
    }

    public List<Long> getFibonacciSequence(int n) {
        List<Long> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long fib = getFibonacciNumber(i);
            sequence.add(fib);
        }
        return sequence;
    }
}
