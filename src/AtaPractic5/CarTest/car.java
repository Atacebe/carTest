package AtaPractic5.CarTest;

public class car {

    public String brand,model;
    public int year;
    public double price;
    public String color;
    public int miles;


    public car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
    public  void start(){
        System.out.println(brand+" "+model+" is starting");
    }
    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }
    /*
    public void fly(){

    }

     */

    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
