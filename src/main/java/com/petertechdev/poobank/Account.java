package com.petertechdev.poobank;

public abstract class Account implements AppBank {


    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCE = 1;

    protected int agency;
    protected int number;
    protected double accountBalance;
    protected User user;

    public Account(User user) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCE++;
        this.user = user;
    }

    @Override
    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
    }

    @Override
    public void transfer(double amount, AppBank receivingAccount) {
        this.withdraw(amount);
        receivingAccount.deposit(amount);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    protected void printAccountData() {
        System.out.println(String.format("Titular: %s", this.user.getUsername()));
        System.out.println(String.format("Agencia: %s", this.agency));
        System.out.println(String.format("Numero: %s", this.number));
        System.out.println(String.format("Saldo: %s", this.accountBalance));
    }
}
