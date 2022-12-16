package DAy39_Recap_Encaps_Inher.shapeTAsk;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("invalid side");
            System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        super("square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + side + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */