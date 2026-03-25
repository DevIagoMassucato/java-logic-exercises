package com.iagomassucato.java_logic_exercises.sumcomparison;

public class CalculatorService {

    public static int som(int a, int b){
        return a + b;
    }

    public static boolean theSumIsGreaterThanC(int a, int b, int c){
        return som(a,b) > c;
    }

    public static boolean isDivisible(int number){
        return number % 2 == 0;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}
