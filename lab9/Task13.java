class Course {
    void startCourse(){System.out.println("Course started");}
}

class ProgrammingCourse extends Course {}
class MathCourse extends Course {}
class HistoryCourse extends Course {}

public class Task13 {
    public static void main(String[] args) {
        new ProgrammingCourse().startCourse();
    }
}
