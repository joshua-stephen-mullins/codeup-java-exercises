package util;

import java.util.Scanner;


public class Input {

    private static Scanner scanner = new Scanner(System.in);


    public static String getString() {
        return scanner.nextLine();
    };

    public static boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yah") || input.equalsIgnoreCase("yeah") || input.equalsIgnoreCase("yup");
    };

    public static int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        int input = scanner.nextInt();
        if (input < min | input > max) {
            getInt(min, max);
        }
        return input;
    };

    public static int getInt() {
        int finalUserInput = 0;
        do {
            try {
                String userInput = getString();
                finalUserInput = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a number.");
            }
            ;
        } while (finalUserInput == 0);
        return finalUserInput;
    };

    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s", min, max);
        double input = scanner.nextDouble();
        if (input < min | input > max) {
            getDouble(min, max);
        }
        return input;
    };

    public static double getDouble() {
        double finalUserInput = 0;
        do {
            try {
                String userInput = getString();
                finalUserInput = Double.parseDouble(userInput);
            } catch (Exception e) {
                System.out.println("Invalid input: Please enter a number.");
            }
        } while (finalUserInput == 0);
        return finalUserInput;
    };

}
