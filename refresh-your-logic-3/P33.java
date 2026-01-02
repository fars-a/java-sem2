class BankAccount{
    int balance=1000;
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposited: "+amount+"\nBalance: "+balance);
    }
    public void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
        System.out.println("Withdrawn: "+amount+"\nBalance: "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class DepositThread extends Thread{
    BankAccount acc;
    int amount;
    public DepositThread(BankAccount acc,int amount){
        this.acc=acc;
        this.amount=amount;
    }
    public void run(){
        acc.deposit(amount);
    }
}
class WithdrawThread extends Thread{
    BankAccount acc;
    int amount;
    public WithdrawThread(BankAccount acc,int amount){
        this.acc=acc;
        this.amount=amount;
    }
    public void run(){
        acc.withdraw(amount);
    }
}
class P33{
    public static void main(String args[]){
        BankAccount acc=new BankAccount();
        DepositThread d1=new DepositThread(acc,200);
        WithdrawThread w1=new WithdrawThread(acc,200);
        d1.start();
        w1.start();
    }
}