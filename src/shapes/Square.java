package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    public double getArea() {
        return this.side * 2;
    }

    public void setLength(double length) {
        this.side = length;
    }

    public void setWidth(double width) {
        this.side = width;
    }
}
