package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount JonsAccount = new BankAccount();
        JonsAccount.setBalance(1000);
        System.out.println("Jon's account balance is: " + JonsAccount.getBalance());
        JonsAccount.deposit(50);
        System.out.println("After depositing $50, your new balance is: " + JonsAccount.getBalance());
        JonsAccount.withdrawal(2000);
        System.out.println("Jon's account after withdrawing $2000 is: " + JonsAccount.getBalance());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getVIPName());

        VipCustomer customer2 = new VipCustomer("Jon", 25000);
        System.out.println(customer2.getVIPName());
        System.out.println(customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("Jack", 100, "jack@email.com");
        System.out.println(customer3.getVIPName());
    }
}
