class Device {
    String brand;
    Device(String b){brand=b;}
    void turnOn(){System.out.println(brand+" on");}
}

class Laptop extends Device { Laptop(String b){super(b);} }
class Smartphone extends Device { Smartphone(String b){super(b);} }
class Tablet extends Device { Tablet(String b){super(b);} }

public class Task6 {
    public static void main(String[] args) {
        new Laptop("HP").turnOn();
    }
}
