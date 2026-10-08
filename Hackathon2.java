import java.util.Scanner;
public class Hackathon2 {
    String AName;
    int AccNo;
    double OriBalance;
    double CurrBalance;
    void Hackathon2(String AName, int AccNo, double Balance) {
        this.AName = AName;
        this.AccNo = AccNo;
        this.OriBalance = Balance;
    }
    double deposit(double amount){
        CurrBalance = OriBalance + amount;
        return CurrBalance;
    }
    double withdraw(double amount){
        if(amount<=CurrBalance){
            CurrBalance = CurrBalance-amount;
        }
        return CurrBalance;
    }
    double checkBalance(){
        return CurrBalance;
    }
    void displayAccount(){
        System.out.println("Account Holder name: " + AName);
        System.out.println("Account Number: " + AccNo);
        System.out.println("The Original Balance was: " + OriBalance);
        System.out.println("Current Account Balance: " + CurrBalance);

    }
}
class BankAccount{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Account Holder name: ");
        String name = input.nextLine();
        System.out.println("Enter the Account Number: ");
        int accNo = input.nextInt();
        System.out.println("Enter the original balance:");
        double balance = input.nextDouble();
        Hackathon2 account = new Hackathon2();
        account.Hackathon2(name, accNo, balance);
        System.out.println("Enter the amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Enter the amount to be withdrawn: ");
        double withdrawAmt = input.nextDouble();
        account.withdraw(withdrawAmt);
        account.displayAccount();
        input.close();
    }
}
