class Vehicle {
    void startEngine(){System.out.println("Engine started");}
}

class Bike extends Vehicle {}
class Bus extends Vehicle {}
class Taxi extends Vehicle {}

public class Task8 {
    public static void main(String[] args) {
        new Taxi().startEngine();
    }
}
