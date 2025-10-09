interface Loan {
    void applyLoan(double amount);
    void calculateInterest();
}

class HomeLoan implements Loan {
    double amount;
    double interestRate = 8.5;

    public void applyLoan(double amount) {
        this.amount = amount;
        System.out.println("Home loan applied for amount: " + amount);
    }

    public void calculateInterest() {
        double interest = (amount * interestRate) / 100;
        System.out.println("Home loan interest: " + interest);
    }
}

class CarLoan implements Loan {
    double amount;
    double interestRate = 9.2;

    public void applyLoan(double amount) {
        this.amount = amount;
        System.out.println("Car loan applied for amount: " + amount);
    }

    public void calculateInterest() {
        double interest = (amount * interestRate) / 100;
        System.out.println("Car loan interest: " + interest);
    }
}

public class labsession5 {
    public static void main(String[] args) {
        Loan home = new HomeLoan();
        home.applyLoan(500000);
        home.calculateInterest();

        System.out.println();

        Loan car = new CarLoan();
        car.applyLoan(300000);
        car.calculateInterest();
    }
}
