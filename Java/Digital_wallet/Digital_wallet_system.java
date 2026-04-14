package Java.Digital_wallet;
import java.util.*;

class Digital_wallet_system {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WalletService service = new WalletService();

        Map<Integer, User> users = new HashMap<>();
        int userCounter = 1;

        while (true) {
            System.out.println("\n--- Digital Wallet Menu ---");
            System.out.println("1. Create User");
            System.out.println("2. Add Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // ✅ Create User with PIN
                case 1:
                    System.out.print("Enter user name: ");
                    String name = sc.next();

                    System.out.print("Set 4-digit PIN: ");
                    int pin = sc.nextInt();

                    User newUser = new User(userCounter, name, pin);
                    users.put(userCounter, newUser);

                    System.out.println("User created with ID: " + userCounter);
                    userCounter++;
                    break;

                // 💰 Add Money (PIN required)
                case 2:
                    System.out.print("Enter user ID: ");
                    int uid = sc.nextInt();
                    User user = users.get(uid);

                    if (user == null) {
                        System.out.println("User not found");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    int enteredPin = sc.nextInt();

                    if (!user.validatePin(enteredPin)) {
                        System.out.println("Incorrect PIN");
                        break;
                    }

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    service.addMoney(user, amount);
                    break;

                // 💸 Transfer Money (PIN required)
                case 3:
                    System.out.print("Enter sender ID: ");
                    int fromId = sc.nextInt();
                    System.out.print("Enter receiver ID: ");
                    int toId = sc.nextInt();

                    User fromUser = users.get(fromId);
                    User toUser = users.get(toId);

                    if (fromUser == null || toUser == null) {
                        System.out.println("Invalid user ID(s)");
                        break;
                    }

                    System.out.print("Enter sender PIN: ");
                    int senderPin = sc.nextInt();

                    if (!fromUser.validatePin(senderPin)) {
                        System.out.println("Incorrect PIN");
                        break;
                    }

                    System.out.print("Enter amount: ");
                    double transferAmount = sc.nextDouble();
                    service.transferMoney(fromUser, toUser, transferAmount);
                    break;

                // 📊 Check Balance (PIN required)
                case 4:
                    System.out.print("Enter user ID: ");
                    int checkId = sc.nextInt();
                    User checkUser = users.get(checkId);

                    if (checkUser == null) {
                        System.out.println("User not found");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    int checkPin = sc.nextInt();

                    if (!checkUser.validatePin(checkPin)) {
                        System.out.println("Incorrect PIN");
                        break;
                    }

                    service.checkBalance(checkUser);
                    break;

                case 5:
                    service.showTransactions();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
