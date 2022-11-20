package com.petertechdev.poobank;

import java.util.List;

public class Bank {

    private String name;
    private List<Account> accountList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
