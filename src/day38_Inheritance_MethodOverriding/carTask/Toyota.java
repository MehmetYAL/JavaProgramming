package day38_Inheritance_MethodOverriding.carTask;

public class Toyota extends Car{
    public Toyota( String model, int year,int miles,String color,   double price) {
        super("Toyota", model, year, miles, color, price);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    public void start(){
        System.out.println("Twist the key to start"+brand+" "+model);

    }

}
