package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running CloudTask Java project...");

        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);

        System.out.println("5 + 3 = " + sum);
    }
}
