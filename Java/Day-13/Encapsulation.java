class ATM1{
    private int balance = 5000;
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance.");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        ATM1 myATM = new ATM1();
        System.out.println("Initial Balance: " + myATM.getBalance());
        myATM.deposit(2000);
        myATM.withdraw(3000);
        myATM.withdraw(5000);
    }
}