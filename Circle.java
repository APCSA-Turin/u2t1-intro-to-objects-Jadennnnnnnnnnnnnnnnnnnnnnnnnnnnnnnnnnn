

public class Circle {
    private final double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public double area() {
        double area = radius * radius * Math.PI;
        return area;
    }
}