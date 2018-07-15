package com.springScopes.Service;

public class SessionScope {

	int number = 100;

	public int getNumber() {

		return this.number;
	}

	public void generateRandomNumber() {
		this.number = (int) (Math.random() * 10000);

	}

}
