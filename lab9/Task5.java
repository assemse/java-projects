class Person {
    String name;
    Person(String n){name=n;}
}

class Student extends Person {
    Student(String n){super(n);}
    void study(){System.out.println(name+" studies");}
}

class Teacher extends Person {
    Teacher(String n){super(n);}
    void teach(){System.out.println(name+" teaches");}
}

class Administrator extends Person {
    Administrator(String n){super(n);}
    void manage(){System.out.println(name+" manages");}
}

public class Task5 {
    public static void main(String[] args) {
        new Student("Ali").study();
    }
}
