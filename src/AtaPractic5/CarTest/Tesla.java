package AtaPractic5.CarTest;

public class Tesla extends car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }
}
