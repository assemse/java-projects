class Character {
    void attack(){System.out.println("attack");}
}

class Warrior extends Character {
    void attack(){System.out.println("Sword attack");}
}

class Mage extends Character {
    void attack(){System.out.println("Magic attack");}
}

class Archer extends Character {
    void attack(){System.out.println("Arrow attack");}
}

public class Task14 {
    public static void main(String[] args) {
        new Mage().attack();
    }
}
