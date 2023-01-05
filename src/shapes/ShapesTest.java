package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5 ,4);
//
//        System.out.println("Box 1 Area: " + box1.getArea());
//        System.out.println("Box 1 Perimeter: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("Box 2 Area: " + box2.getArea());
//        System.out.println("Box 2 Perimeter: " + box2.getPerimeter());

        Measurable myShape;

        myShape = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + myShape.getArea());
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle Length: " + myShape.getLength());
        System.out.println("Rectangle Width: " + myShape.getWidth());

        Measurable myShape2;

        myShape2 = new Square(5);
        System.out.println("Square Area: " + myShape2.getArea());
        System.out.println("Square Perimeter: " + myShape2.getPerimeter());
        System.out.println("Square Length: " + myShape2.getLength());
        System.out.println("Square Width: " + myShape2.getWidth());
    }
}
