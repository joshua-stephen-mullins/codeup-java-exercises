package shapes;
import util.Input;



public class CircleApp {
    public static void main(String[] args) {


        System.out.println("Enter a radius for a circle:");
        double input = Input.getDouble();
        Circle circle1 = new Circle(input);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());
    }
}
