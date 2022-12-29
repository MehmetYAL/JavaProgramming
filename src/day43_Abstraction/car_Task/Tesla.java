package day43_Abstraction.car_Task;

public final class Tesla extends Car{
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("to start say start");
    }
    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+ " has auto pilot feature");
    }
}
