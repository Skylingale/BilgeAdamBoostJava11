package com.bilgeadam.week2.lecture3;

public class question16 {

	public static void main(String[] args) {
		/*
		 * !den 100'e kadar olan çift sayıların toplamının tek sayıların toplamına
		 * oranını bulalım
		 */

		double çifttop = 0;
		double tektop = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				çifttop += i;
			} else {
				tektop += i;
			}

		}
		double oran = çifttop / tektop;
		System.out.println("Oran: " + oran);
	}

}
