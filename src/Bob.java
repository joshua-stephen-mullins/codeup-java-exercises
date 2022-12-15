import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        input = scanner.nextLine();

        System.out.println("What do you say to Bob?");
        if (input.endsWith("?")) {
            System.out.println("Sure!");
        } else if (input.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (input.isEmpty()) {
            System.out.println("Fine. Be that way...");
        } else {
            System.out.println("Whatever.");
        }

    }
}
