package com.petertechdev.poobank;

public class SavingsAccount extends Account{

    public SavingsAccount (User user) {
        super(user);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato conta poupança ===");
        super.printAccountData();
    }
}
