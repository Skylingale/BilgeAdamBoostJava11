package com.bilgeadam.week2.lecture2;

public class question3 {

	/*
	 * Türk lirasını "amount" olarak alalım. Dolara çevirelim.
	 */

	public static void main(String[] args) {
		double amount = 100, dolar, dolarKuru = 26.11;
		dolar = amount / dolarKuru;
		System.out.println("Dolar: " + dolar);

	}

}
