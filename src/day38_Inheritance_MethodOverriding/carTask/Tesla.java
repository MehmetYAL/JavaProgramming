package day38_Inheritance_MethodOverriding.carTask;

public class Tesla extends Car{
    public Tesla( String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }
    public void autopilot(){
        System.out.println(brand+" "+model+" has auto pilot mode");
    }

}
