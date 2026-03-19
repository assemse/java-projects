class Employee {
    String name;
    Employee(String name){this.name=name;}
    void work(){System.out.println(name+" works");}
}

class Manager extends Employee {
    Manager(String n){super(n);}
    void work(){System.out.println(name+" manages");}
}

class Developer extends Employee {
    Developer(String n){super(n);}
    void work(){System.out.println(name+" codes");}
}

class Designer extends Employee {
    Designer(String n){super(n);}
    void work(){System.out.println(name+" designs");}
}

public class Task3 {
    public static void main(String[] args) {
        new Manager("Ali").work();
        new Developer("Dana").work();
    }
}
