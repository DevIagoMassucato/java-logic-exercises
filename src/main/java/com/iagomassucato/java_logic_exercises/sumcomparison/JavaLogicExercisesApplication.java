package com.iagomassucato.java_logic_exercises.sumcomparison;

import java.util.Scanner;

public class JavaLogicExercisesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = InputService.readUserInput(scanner, "Enter the value of A:");
        int b = InputService.readUserInput(scanner, "Enter the value of B:");
        int c = InputService.readUserInput(scanner, "Enter the value of C:");

        System.out.println("A + B = "+CalculatorService.som(a,b));

        if (CalculatorService.theSumIsGreaterThanC(a, b, c)){
            System.out.println("A + B is greater than C");
        }else {
            System.out.println("A + B is less than C");
        }

    }
}
