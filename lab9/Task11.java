class TeamMember {
    String name;
    TeamMember(String n){name=n;}
}

class Player extends TeamMember {
    Player(String n){super(n);}
    void play(){System.out.println(name+" plays");}
}

class Coach extends TeamMember {
    Coach(String n){super(n);}
    void train(){System.out.println(name+" trains");}
}

class Doctor extends TeamMember {
    Doctor(String n){super(n);}
    void heal(){System.out.println(name+" heals");}
}

public class Task11 {
    public static void main(String[] args) {
        new Player("John").play();
    }
}
