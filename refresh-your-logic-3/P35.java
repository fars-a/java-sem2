import java.util.*;
class BankAccount{
    int balance=100;
    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited: "+amount+" Balance: "+balance);
    }
    public synchronized void withdraw(int amount){
        if(balance<amount){
            System.out.println("Transaction failed (Insufficient balance)");
            return;
        }
        balance-=amount;
        System.out.println("Withdrawn: "+amount+" Balance: "+balance);
    }
}
class ATMUser extends Thread{
    BankAccount account;
    boolean isDeposit;
    int amount;
    public ATMUser(BankAccount account,boolean isDeposit,int amount){
        this.account=account;
        this.isDeposit=isDeposit;
        this.amount=amount;
    }
    public void run(){
        if(isDeposit){
            account.deposit(amount);
        }
        else{
            account.withdraw(amount);
        }
    }
}
class P35{
    public static void main(String args[]){
        BankAccount account=new BankAccount();
        ATMUser u1=new ATMUser(account,false,200);
        ATMUser u2=new ATMUser(account,true,100);
        ATMUser u3=new ATMUser(account,false,300);
        u1.start();
        u2.start();
        u3.start();
    }
}