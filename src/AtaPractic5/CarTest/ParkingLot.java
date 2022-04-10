package AtaPractic5.CarTest;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota=new Toyota("Camry",2020,2000,"Gray",123456);
        Tesla tesla=new Tesla("Model S",2022,94990,"red",0);
        BMW bmw=new BMW("X5",2020,25000,"black",200);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
