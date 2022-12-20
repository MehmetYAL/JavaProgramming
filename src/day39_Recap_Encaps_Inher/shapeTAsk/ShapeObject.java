package day39_Recap_Encaps_Inher.shapeTAsk;

public class ShapeObject {
    public static void main(String[] args) {
Square square=new Square(10);
Rectangle rectangle=new Rectangle(7,9);
Circle circle=new Circle(7);
        System.out.println(square);
        System.out.println(rectangle);

        circle.setRadius(9);
        System.out.println(circle);


    }
}
