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
        return this.side * this.side;
    }

    public void setLength(double side) {
        this.side = length;
    }

    public void setWidth(double side) {
        this.side = width;
    }
}
