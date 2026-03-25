package com.iagomassucato.java_logic_exercises.assign;

import com.iagomassucato.java_logic_exercises.sumcomparison.CalculatorService;
import com.iagomassucato.java_logic_exercises.sumcomparison.InputService;

import java.util.Scanner;

public class AssignMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = InputService.readUserInput(scanner, "Enter the value of A");
        int b = InputService.readUserInput(scanner, "Enter the value of B");

        int c;

        if (a ==b){
            c = CalculatorService.som(a, b);
            System.out.println("A and B are equal, therefore C = A + B = "+c);
        }else {
            c = CalculatorService.multiply(a, b);
            System.out.println("A and B are not equal, therefore C = A * B = "+c);
        }
    }
}
