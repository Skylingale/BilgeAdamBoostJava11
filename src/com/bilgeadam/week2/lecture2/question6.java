package com.bilgeadam.week2.lecture2;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		/*
		 * Dairenin alanını ve çevresini bulalım
		 * 
		 * yarı çap dışarıdan input olarak girilicek pi=3.14
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Yarıçap giriniz: ");
		double r = scanner.nextDouble();
		scanner.nextLine();
		double pi = 3.14;
		System.out.println("Dairenin alanı: " + pi * r * r + "\nDairenin çevresi: " + pi * r * 2);
		// yada ayrı yaz böyle System.out.println("Dairenin çevresi " + pi * r * 2);
		scanner.close(); // SCANNER KAPATMAK ÇOK ÖNEMLİ

	}

}
