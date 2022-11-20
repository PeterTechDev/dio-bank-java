package com.petertechdev.poobank;

public class CheckingAccount extends  Account {

    public CheckingAccount (User user) {
        super(user);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato conta corrente ===");
        super.printAccountData();
    }
}
