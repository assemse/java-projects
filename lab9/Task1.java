class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " moves");
    }
}

class Car extends Transport {
    Car(String n, int s) { super(n,s); }
    void move() { System.out.println(name + " drives"); }
}

class Train extends Transport {
    Train(String n, int s) { super(n,s); }
    void move() { System.out.println(name + " on rails"); }
}

class Airplane extends Transport {
    Airplane(String n, int s) { super(n,s); }
    void move() { System.out.println(name + " flies"); }
}

public class Task1 {
    public static void main(String[] args) {
        new Car("BMW", 200).move();
        new Train("Train", 150).move();
        new Airplane("Boeing", 900).move();
    }
}
