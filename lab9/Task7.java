class Animal {
    void makeSound(){System.out.println("sound");}
}

class Lion extends Animal {
    void makeSound(){System.out.println("Roar");}
}

class Elephant extends Animal {
    void makeSound(){System.out.println("Trumpet");}
}

class Monkey extends Animal {
    void makeSound(){System.out.println("Monkey sound");}
}

public class Task7 {
    public static void main(String[] args) {
        new Lion().makeSound();
    }
}