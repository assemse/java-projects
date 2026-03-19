class Appliance {
    void operate(){System.out.println("working");}
}

class Refrigerator extends Appliance {
    void operate(){System.out.println("Cooling");}
}

class WashingMachine extends Appliance {
    void operate(){System.out.println("Washing");}
}

class Microwave extends Appliance {
    void operate(){System.out.println("Heating");}
}

public class Task15 {
    public static void main(String[] args) {
        new Microwave().operate();
    }
}