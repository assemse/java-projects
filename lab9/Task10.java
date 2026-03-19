class Product {
    String name;
    Product(String n){name=n;}
    void showPrice(){System.out.println(name);}
}

class Food extends Product { Food(String n){super(n);} }
class Electronics extends Product { Electronics(String n){super(n);} }
class Clothes extends Product { Clothes(String n){super(n);} }

public class Task10 {
    public static void main(String[] args) {
        new Food("Bread").showPrice();
    }
}
