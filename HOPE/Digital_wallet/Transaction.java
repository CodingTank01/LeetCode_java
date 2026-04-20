class Transaction {
    static int counter = 1;
    int transactionId;
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.transactionId = counter++;
        this.type = type;
        this.amount = amount;
    }

    public void display() {
        System.out.println("TxnID: " + transactionId +
                " | Type: " + type +
                " | Amount: " + amount);
    }
}
