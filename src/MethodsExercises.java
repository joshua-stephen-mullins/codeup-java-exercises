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

    private static void factorial(){
        System.out.println("Please enter a number between 1 and 10: ");
        int NumToFactorialize = getInteger(1, 10);
        long currentSum = 1;
        for(int counter = 1; counter <= NumToFactorialize; counter++){
            currentSum *= counter;
        }
        System.out.printf("%s! = %s\n", NumToFactorialize, currentSum);
        System.out.println("Do another factorial?");
        boolean userChoice = promptContinue();
        if(userChoice){
            factorial();
        }
    }

    public static boolean promptContinue(){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("y")){
            return true;
        } else {
            return false;
        }
    }


    public static void diceRoller(){
        System.out.println("Roll a die! How many faces does it have?");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int min = 1;
        int range = max - min + 1;
        int roll = (int)((Math.random() * range) + min);
        System.out.println("You rolled a: " + (roll));
        System.out.println("Roll another die? y/n");
        boolean userChoice = promptContinue();
        if(userChoice){
            diceRoller();
        }
    }

    public static void main(String[] args) {
//        System.out.println(addition(2, 5));
//        System.out.println(subtraction(2, 5));
//        System.out.println(multiplication(2, 5));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(10, 2));
//        System.out.println(getInteger(1, 10));
//        factorial();
        diceRoller();
    }
}
