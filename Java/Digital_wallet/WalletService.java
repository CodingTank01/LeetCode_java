package Java.Digital_wallet;

import java.util.*;

class WalletService {
    List<Transaction> transactions = new ArrayList<>();

    public void addMoney(User user, double amount) {
        user.wallet.addMoney(amount);
        transactions.add(new Transaction("CREDIT", amount));
        System.out.println("Money added successfully");
    }

    public void transferMoney(User from, User to, double amount) {
        if (from.wallet.deductMoney(amount)) {
            to.wallet.addMoney(amount);
            transactions.add(new Transaction("TRANSFER", amount));
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance(User user) {
        System.out.println(user.name + " Balance: " + user.wallet.getBalance());
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.display();
        }
    }
}
