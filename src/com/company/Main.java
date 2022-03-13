package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("add 1 + 3: %d\n", Calculator.add(1, 3));
        System.out.printf("subtract 1 - 3: %d\n", Calculator.subtract(1, 3));
        System.out.printf("multiply 7 * 7: %d\n", Calculator.multiply(7, 7));
        System.out.printf("divide 8.0 / 2.0: %f\n", Calculator.divide(8, 2));
        System.out.printf("square 6: %d\n", Calculator.square(6));

    }
}