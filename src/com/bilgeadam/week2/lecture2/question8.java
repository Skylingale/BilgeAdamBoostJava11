package com.bilgeadam.week2.lecture2;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan girilen sayının faktöriyelini hesaplayın
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayı = scanner.nextInt();
		int faktöriyel = 1;
		for (int i = 1; i <= sayı; i++) {

			faktöriyel = faktöriyel * i;

		}

		System.out.println("Sayının faktöriyeli: " + faktöriyel);
	}

}
