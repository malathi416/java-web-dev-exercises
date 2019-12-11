package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {
    protected  double balance;
    private  int accountNo;
    private static int nextAccountNumber = 700;

    public BankAccount(double balance){
        this.balance = balance;
        this.accountNo = nextAccountNumber;
        this.nextAccountNumber++;
    }
    public double getBalance(){
        return this.balance;
    }
    public boolean withdrawal(double amount){
        if(amount < this.balance && amount > 0){
            this.balance = this.balance -amount;
            return  true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNo == that.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

    public boolean deposit(double amount){
//        if(amount > 0){
//            this.balance = this.balance + amount;
//            return true;
//        }
//        return false;
        if(amount<=0){
            throw new IllegalArgumentException();
        }
        this.balance = this.balance + amount;
        return true;
    }
    public static void main(String[] args){
        BankAccount doughsaccount = new BankAccount(1000);
        System.out.println(doughsaccount);
        System.out.println(doughsaccount.withdrawal(50));
        System.out.println(doughsaccount);
        //BankAccount jennysAccount = doughsaccount;
        System.out.println(doughsaccount);
       // System.out.println(doughsaccount == jennysAccount);
        //answer is true;

        BankAccount jennysAccount = new BankAccount(1000);
        jennysAccount.withdrawal(50);
        System.out.println(doughsaccount == jennysAccount);
        //answer is false;


        //TRy catch
        try{
            doughsaccount.deposit(-30);
        }catch (IllegalArgumentException e){
           // e.printStackTrace();//to print where the error comes from
            System.out.println("In catch");
            doughsaccount.deposit(30);
        }
        }
    }

