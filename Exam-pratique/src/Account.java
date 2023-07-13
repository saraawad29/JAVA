public class Account {

    private int reference;

    private double balance;

    // constructeur

    public Account(int reference, double balance){
        this.reference = reference;
        this.balance = balance;
    }

    // methode

    public int getReference() {
        return reference;
    }

    public double getBalance() {
        return balance;
    }

    public double setDeposit(double amount) {
        balance += amount;
        return amount;
    }

    public double setWithdraw(double test) {
        balance = balance - test;
        return test;
    }

}

