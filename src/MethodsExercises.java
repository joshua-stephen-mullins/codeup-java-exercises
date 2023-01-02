import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b){
        return a % b;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input;
        input = scanner.nextInt();
        if (input < min | input > max){
            getInteger(min, max);
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(addition(2, 5));
        System.out.println(subtraction(2, 5));
        System.out.println(multiplication(2, 5));
        System.out.println(division(10, 2));
        System.out.println(modulus(10, 2));
        System.out.println(getInteger(1, 10));
    }
}
