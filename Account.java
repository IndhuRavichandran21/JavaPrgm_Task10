package task10;

public class Account {
    public int balance;
    public int accountNo;
    public int depositAmount;
    public int withdrawAmount;
    public int amount;

    public Account(){
        balance=250000;
        accountNo=1234;
    }

    public Account(int balance,int accountNo){
        this.balance=balance;
        this.accountNo=accountNo;
    }

    public int withdraw(int withdrawAmount){     
        this.withdrawAmount=withdrawAmount;
        balance=balance-withdrawAmount;
        return balance;
    }

    public int deposit(int depositAmount){
        this.depositAmount=depositAmount;
        balance=balance+depositAmount;
        return balance;

    }

    public static void main(String[] args) {
        Account accountWithNoArgs=new Account();
        System.out.println("Constructor without arguments:");
        System.out.println("Account balance is "+accountWithNoArgs.balance);
        accountWithNoArgs.withdraw(50000);
        System.out.println("Remaining Balance after withdrawing the amount "+accountWithNoArgs.withdrawAmount+" is "+accountWithNoArgs.balance);
        
        System.out.println("\nAccount balance is "+accountWithNoArgs.balance);
        accountWithNoArgs.deposit(25000);     
        System.out.println("The Balance after depositing the amount "+accountWithNoArgs.depositAmount+" is "+accountWithNoArgs.balance);

        System.out.println("\nConstructor with arguments:");
        Account accountWithArgs=new Account(250000,1234);
        System.out.println("Account balance is "+accountWithArgs.balance);
        accountWithArgs.withdraw(50000);
        System.out.println("Remaining Balance after withdrawing the amount "+accountWithArgs.withdrawAmount+" is "+accountWithArgs.balance);
        
        System.out.println("\nAccount balance is "+accountWithArgs.balance);
        accountWithArgs.deposit(25000);     
        System.out.println("The Balance after depositing the amount "+accountWithArgs.depositAmount+" is "+accountWithArgs.balance);

    }
}
