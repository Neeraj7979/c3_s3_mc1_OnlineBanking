import java.util.Scanner;
public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount s1= new SavingAccount();
        s1.setAccountHolderName("Neeraj Kumar");
        s1.setAccountOpeningDate("12/05/2022");
        s1.setAvailableBalance(678900.67);
        s1.setInternetAndMobileBankingEnabled(true);
        s1.setModeOfOperation("Self");
        System.out.println("The customer Account number is :");
        s1.autogeneratedAccountNumber();
        System.out.println("\nCustomer name : " + s1.getAccountHolderName());
        System.out.println("Account opening Date :" + s1.getAccountOpeningDate());
        System.out.println("Available Balance = " + s1.getAvailableBalance());
        s1.accountStatus();
        System.out.println("Is internet and Mobile banking Enabled : " + s1.isInternetAndMobileBankingEnabled());
        System.out.println("Mode of operation :"+ s1.getModeOfOperation());
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount to be debited");
        double amountDebit=sc.nextDouble();
        s1.debitAmount(amountDebit);
        System.out.println("your account is debited by "+amountDebit +".The available balance is :"+s1.debitAmount(amountDebit));
        System.out.println("Enter amount to be credited");
        double amountCredit=sc.nextDouble();
        System.out.println("your account is credited by "+amountCredit +".The available balance is :"+s1.creditAmount(amountCredit));

    }
}