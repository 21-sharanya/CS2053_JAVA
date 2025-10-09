abstract class Account{
    String accholder;
    double balance;

    Account(String accholder, double balance){
        this.accholder = accholder;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void display(){
        System.out.println("Account Holder: " + accholder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account{
    SavingsAccount(String accholder, double balance){
        super(accholder, balance);
    }

    void calculateInterest(){
        double interest = balance * 0.8;
        balance += interest;
        System.out.println("Savings Account Interest Added: " + interest + " rupees.");
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String accholder, double balance){
        super(accholder, balance);
    }

    void calculateInterest(){
        System.out.println("Current Account: No interest added.");
    }
}

public class labsession4 {
    public static void main(String[] args) {
        Account ac1 = new SavingsAccount("Sharanya", 10000);
        Account ac2 = new CurrentAccount("Prasad", 120000);
        ac1.calculateInterest();
        ac1.display();
        ac2.calculateInterest();
        ac2.display();
    }
}
