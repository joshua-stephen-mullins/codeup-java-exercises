package util;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {


        System.out.println("Enter String:");
        System.out.println(Input.getString());
        System.out.println("Enter Yes or No:");
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(1, 10));
        System.out.println("Enter any number:");
        System.out.println(Input.getInt());
        System.out.println("Enter a number between 1 and 10:");
        System.out.println(Input.getDouble(1, 10));
        System.out.println("Enter any number:");
        System.out.println(Input.getDouble());

        System.out.println("int: " + Input.getInt());
        System.out.println("double: " + Input.getDouble());

    }
}
