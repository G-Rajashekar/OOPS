class bankAccount{

    private String accountHolderName;
    private double balance;

    bankAccount(String accountHolderName,double balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount>0) balance+=amount;
        else System.out.println("Depoise amount should be positive");
    }

    public void withdraw(double amount){
        if (balance>=amount) balance-=amount;
        else System.out.println("Insufficient balance");
    }

}

public class Encapsulation{
    public static void main(String[] args){
        bankAccount account=new bankAccount("rajashekar",1000);

        System.out.println("Account Holder Name: "+account.getAccountHolderName());
        System.out.println("Balance: "+account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: "+account.getBalance());

        account.withdraw(300);

        System.out.println("Balance after withdrawl: "+account.getBalance());
    }
}