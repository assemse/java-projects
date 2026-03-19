class Instrument {
    void playSound(){System.out.println("sound");}
}

class Guitar extends Instrument {
    void playSound(){System.out.println("Guitar");}
}

class Piano extends Instrument {
    void playSound(){System.out.println("Piano");}
}

class Drums extends Instrument {
    void playSound(){System.out.println("Drums");}
}

public class Task12 {
    public static void main(String[] args) {
        new Guitar().playSound();
    }
}
