package com.kodilla.testing.Calculator;

public class Calculator {
    public Integer addAToB(int a, int b) {
        return a + b;
    }

    public Integer substractAFromB(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator Calculator = new Calculator();

        Integer result = Calculator.substractAFromB(25, 245);
        System.out.println("Its Work and result is : " + result);

    }
}
