package com.julian.bank.domain;

public class BankAccount {
    public int number;
    public int balance;
    public String type;
    public Person holder;
    public Bank bank;
    public boolean isActive;
    //methods
    //this refers to a object of this class
    public boolean deposit(double moneyToDeposit){
        if (this.isActive) {
            this.balance += moneyToDeposit;
            return true;
        }
        System.out.println("DEPOSIT FAILED THE ACCOUNT IS INACTIVE");
        return false;
    }
    public boolean withdraw(double moneyToWithdraw){
        if (this.isActive && this.balance>=moneyToWithdraw){
                this.balance -= moneyToWithdraw;
                return true;
        }
        return false;
    }
    public boolean transfer(){
        return true;
    }
    public String getBalance(){
        return this.holder.name+",Your balance is "+ this.balance;
    }

}
