package Day38_Inheritance_MethodOverriding.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Corolla","Red",2020,123,20000);

        Tesla tesla=new Tesla("x25","Black",2022,10,50000);

        BMW bmw=new BMW("X5","Blue",2022,54,40000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
