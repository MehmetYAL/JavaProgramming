package day38_Inheritance_MethodOverriding.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("yaris",10000,2020,"Corolla",20000);

        Tesla tesla=new Tesla("x25",2022,1050,"Black",50000);

        BMW bmw=new BMW("X5",2021,5000,"Blue",40000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
