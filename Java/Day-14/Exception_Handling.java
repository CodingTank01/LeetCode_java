import java.util.*;

class InvalidPinException extends Exception{
    InvalidPinException(String str){
        super(str);
    }
}

class InSufficientBalanceException extends Exception{
    InSufficientBalanceException(String str){
        super(str);
    }
}

class ATM {
    private final int pin = 1234;
    private int balance = 5000;
    public void pinValidate(int p) throws InvalidPinException{
        if(p!=pin){
            throw new InvalidPinException("Invalid pin. Please try again.");
        }
        else{
            System.out.println("Pin verified successfully.");
        }
    }
    
    public void checkBalance(){
        System.out.println("Balance: "+balance);
    }
    
    public void deposit(int b){
        balance+=b;
        System.out.println("Amount deposited successfully");
    }
    
    public void withdrawl(int b) throws InSufficientBalanceException{
        if(b>balance){
            throw new InSufficientBalanceException("Insufficient Balance.");
        }
        else{
            balance-=b;
            System.out.println("Amount withdrawn successfully");
        }
    }
}

class Exception_Handling {
    public static void main(String[] args){
        ATM sbi = new ATM();
        System.out.println("WELCOME TO SBI ATM");
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("ENTER YOUR PIN");
            int p = sc.nextInt();
            sbi.pinValidate(p);
            System.out.println("SELECT:\n1. CHECK BALANCE\n2. DEPOSIT\n3. WITHDRAW");
            System.out.println("PLEASE ENTER YOUR CHOICE: ");
            int ch = sc.nextInt();
            
            switch(ch){
                case 1:
                    sbi.checkBalance();
                    break;
                case 2:
                    System.out.println("ENTER AN AMOUNT TO DEPOSIT: ");
                    int d = sc.nextInt();
                    sbi.deposit(d);
                    break;
                case 3:
                    System.out.println("ENTER AN AMOUNT TO WITHDRAW: ");
                    int w = sc.nextInt();
                    sbi.withdrawl(w);
                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID CHOICE.");
            }      
        }
        catch(InvalidPinException e){
            System.out.println(e.getMessage());
        }
        catch(InSufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("THANK YOU FOR USING SBI.");
        }
    }
}