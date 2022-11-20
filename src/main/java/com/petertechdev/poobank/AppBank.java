package com.petertechdev.poobank;

public interface AppBank {

    void withdraw (double amount);

    void deposit (double amount);

    void transfer (double amount, AppBank receivingAccount);

    void printStatement ();
}
