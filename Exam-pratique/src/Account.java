public class Account {

    private String reference;

    private double balance;




    // constructeur

    public Account(String reference, double balance){
        this.reference = reference;
        this.balance = 0;
    }

    // methode

    public String getReference() {
        return reference;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance += amount;
    }

}

