import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i += 1;
//        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);

//        for (int j = 100; j >= -10; j-=5){
//            System.out.println(j);
//        }

//        long p = 2;
//        do {
//            System.out.println(p);
//            p *= p;
//        } while (p < 1000000);

//        for (long p = 2; p < 1000000; p *= p) {
//            System.out.println(p);
//        }

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 0; i <= 100; i++){
//            if ((i % 3 == 0) & (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        int userInput = 0;
        String playAgain = "y";

        while(playAgain.equalsIgnoreCase("y")){
            System.out.print("What number would you like to go to?");
            userInput = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= userInput; i++){
            System.out.printf(" %s    | --%s--- | -%s--\n", i, i*i, i*i*i);
            }
            System.out.println("Would you like to play again?");
            playAgain = scanner.next();
        }


    }
}
