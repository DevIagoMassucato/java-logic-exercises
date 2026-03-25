package com.iagomassucato.java_logic_exercises.evenodd;

import com.iagomassucato.java_logic_exercises.sumcomparison.CalculatorService;
import com.iagomassucato.java_logic_exercises.sumcomparison.InputService;

import java.util.Scanner;

public class EvenOddMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = InputService.readUserInput(scanner, "Enter the value of number:");

        if (CalculatorService.isDivisible(number)) {
            System.out.println("The number "+number+" is even");
        }else{
            System.out.println("The number "+number+" is odd");
        }

    }
}
