package shapes;

public class Square extends Rectangle{

    protected double side;

    public Square(){
    }

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public double getArea(){
        System.out.println("Square Function");
        return side * 4;
    }

    public double getPerimeter(){
        System.out.println("Square Function");
        return Math.pow(this.side, 2);
    }
}
