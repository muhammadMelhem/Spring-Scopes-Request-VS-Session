package com.springScopes.Service;

public class RequestScope {

	int number = 50;

	public int getNumber() {

		return this.number;
	}

	public void generateRandomNumber() {
		this.number = (int) (Math.random() * 10000);

	}

}
