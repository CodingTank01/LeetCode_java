package Java.Digital_wallet;

class Wallet {
    double balance;

    Wallet() {
        this.balance = 0.0;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
