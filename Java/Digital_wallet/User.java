package Java.Digital_wallet;

class User {
    int userId;
    String name;
    Wallet wallet;
    int pin;

    User(int userId, String name, int pin) {
        this.userId = userId;
        this.name = name;
        this.pin = pin;
        this.wallet = new Wallet();
    }

    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }
}
