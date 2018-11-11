package com.tsekhanovich.masterclass.oop.constructors.lecture37;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(100);

        account.deposit(50);
        account.withdraw(100);
        account.withdraw(100);
    }
}
