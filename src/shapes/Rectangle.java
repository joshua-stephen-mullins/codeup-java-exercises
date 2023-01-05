package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        super(length, width);
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}