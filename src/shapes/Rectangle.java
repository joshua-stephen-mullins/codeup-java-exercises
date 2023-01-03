package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(){
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("Rectangle Function");
        return this.width * this.length;
    }

    public double getPerimeter(){
        System.out.println("Rectangle Function");
        return (2 * this.length) + (2 * this.width);
    }


}
