class Component {
    void showInfo(){System.out.println("Component");}
}

class CPU extends Component {}
class RAM extends Component {}
class GPU extends Component {}

public class Task9 {
    public static void main(String[] args) {
        new CPU().showInfo();
    }
}
