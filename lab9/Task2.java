class Shape {
    double area() { return 0; }
}

class Circle extends Shape {
    double r;
    Circle(double r){ this.r = r; }
    double area(){ return Math.PI*r*r; }
}

class Rectangle extends Shape {
    double a,b;
    Rectangle(double a,double b){this.a=a;this.b=b;}
    double area(){ return a*b; }
}

class Triangle extends Shape {
    double a,h;
    Triangle(double a,double h){this.a=a;this.h=h;}
    double area(){ return 0.5*a*h; }
}

public class Task2 {
    public static void main(String[] args) {
        System.out.println(new Circle(3).area());
        System.out.println(new Rectangle(4,5).area());
    }
}
