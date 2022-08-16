public class SavingAccount {
  private String accountHolderName;
  private int accountNumber;
  private String accountOpeningDate;
  private boolean accountStatus;
  private double availableBalance;
  private double totalBalance;
  private boolean internetAndMobileBankingEnabled;
  private String modeOfOperation;

  public String getAccountHolderName(){
    return accountHolderName;
  }
  public void setAccountHolderName(String accountHolderName){
    this.accountHolderName=accountHolderName;
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
  }
  public String getAccountOpeningDate(){
    return accountOpeningDate;
  }
  public void setAccountOpeningDate(String accountOpeningDate){
    this.accountOpeningDate=accountOpeningDate;
  }
  public boolean isAccountStatus(){
    return accountStatus;
  }
  public void setAccountStatus(boolean accountStatus){
    this.accountStatus=accountStatus;
  }
  public double getAvailableBalance(){
    return availableBalance;
  }
  public void setAvailableBalance(double availableBalance){
    this.availableBalance=availableBalance;
  }
  public double getTotalBalance(){
    return totalBalance;
  }
  public void setTotalBalance(double totalBalance){
    this.totalBalance=totalBalance;
  }
  public boolean isInternetAndMobileBankingEnabled(){
    return internetAndMobileBankingEnabled;
  }
  public void setInternetAndMobileBankingEnabled(boolean internetAndMobileBankingEnabled){
    this.internetAndMobileBankingEnabled=internetAndMobileBankingEnabled;
  }
  public String getModeOfOperation(){
    return modeOfOperation;
  }
  public void setModeOfOperation(String modeOfOperation){
    this.modeOfOperation=modeOfOperation;
  }

  public double retrieveBalance(){
    return totalBalance;
  }
  public double debitAmount(double amount){
    return totalBalance=availableBalance-amount;
  }
  public double creditAmount(double amount){
    return totalBalance=availableBalance+amount;
  }



}
