package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
    System.out.println("Tekst ze dziala");
    System.out.println("Tekst ze dziala= " + testAddToB(2.0,2.0, 4.0));
    System.out.println("Tekst ze dziala= " + testSubstractAFromB(2.0,2.0, 4.0));

    }

    public static boolean testAddToB (double a, double b, double expected){
        Calculator calculator;
        calculator = new Calculator();

        double result = calculator.addAToB(a,b);
        return result==expected;

    }

    public static boolean testSubstractAFromB (double a, double b, double expected){
        Calculator calculator;
        calculator = new Calculator();

        double result = calculator.substractAFromB(a,b);
        return result==expected;

    }
    }
