package com.petertechdev.poobank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooBankApplication.class, args);

		User lebronJames = new User();
		lebronJames.setUsername("LeBronJames");

		Account lebronCheckingAccount = new CheckingAccount(lebronJames);
		Account lebronSavingsAccount = new SavingsAccount(lebronJames);

		lebronCheckingAccount.deposit(5000);
		lebronCheckingAccount.transfer(4000, lebronSavingsAccount);

		lebronCheckingAccount.printStatement();
		lebronSavingsAccount.printStatement();
	}
}
