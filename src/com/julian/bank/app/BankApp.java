package com.julian.bank.app;

import com.julian.bank.domain.BankAccount;
import com.julian.bank.domain.Person;

public class BankApp {
    public static void main(String[] args) {
        Person diana = new Person();
        diana.id=357;
        diana.name ="Jose";

        BankAccount myAccount= new BankAccount();
        myAccount.holder = diana;
        myAccount.isActive=true;
        myAccount.deposit(50);

        System.out.println(myAccount.getBalance());


    }
}
