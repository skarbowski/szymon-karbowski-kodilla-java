package com.kodilla.testing.Calculator;

public class Calculator {
    public double addAToB(double a, double b) {
        return a + b;
    }

    public double substractAFromB(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result = calculator.addAToB(2.5, 2.45);
        System.out.println("Its Work and result is : " + result);

        double results = calculator.substractAFromB(2.5, 2.0);
       System.out.println("its work and result is : " + results);
    }
}