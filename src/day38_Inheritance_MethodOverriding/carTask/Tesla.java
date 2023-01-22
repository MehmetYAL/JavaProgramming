package day38_Inheritance_MethodOverriding.carTask;

public class Tesla extends Car{
    public Tesla( String model, int year,int miles,String color,   double price) {
        super("Tesla", model, year, miles, color, price);
    }
    public void autopilot(){
        System.out.println(brand+" "+model+" has auto pilot mode");
    }

}
