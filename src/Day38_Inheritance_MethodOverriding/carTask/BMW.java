package Day38_Inheritance_MethodOverriding.carTask;

public class BMW extends Car{
    public BMW( String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }

    public void racing() {
        System.out.println(brand+" "+model+" is racing");


    }

    @Override
    public void start() {
        System.out.println("Say start "+brand+" "+model);
    }
}
