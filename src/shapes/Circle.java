package shapes;

public class Circle {

    private double radius;

    public Circle () {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

}
