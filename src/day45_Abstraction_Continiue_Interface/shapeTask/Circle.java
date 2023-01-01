package day45_Abstraction_Continiue_Interface.shapeTask;

public class Circle extends Shape{

    private double radius;
    public final static double pi=3.14;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0)
            throw new RuntimeException(" invalid data"+radius);
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
