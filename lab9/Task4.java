class BankAccount {
    double balance;
    BankAccount(double b){balance=b;}

    void deposit(double a){balance+=a;}
    void withdraw(double a){balance-=a;}
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double b){super(b);}
}

class CreditAccount extends BankAccount {
    CreditAccount(double b){super(b);}
}

public class Task4 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000);
        s.deposit(200);
        System.out.println(s.balance);
    }
}
