package com.iagomassucato.java_logic_exercises.sumcomparison;

import java.util.Scanner;

public class InputService {

    public static int readUserInput(Scanner scanner, String message){
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please try again");
                scanner.next();
            }
        }
    }
}
