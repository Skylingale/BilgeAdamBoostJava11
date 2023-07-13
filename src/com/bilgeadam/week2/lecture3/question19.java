package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question19 {

	public static void main(String[] args) {
		/*
		 * Girilen Sayının Asal Olup Olmadığını bulan ve buna çıktı veren program
		 */
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sayaç;
		if (i == 2) {
			System.out.println(i + " asal sayıdır.");
		}
		if (i == 1)
			System.out.println(i + " asal sayı değildir");
		else {
			for (sayaç = 3; sayaç < i; sayaç++) {
				if (i % sayaç == 0) {
					System.out.println(i + " asal sayı değildir.");
				} else {
					System.out.println("Sayı asaldır.");
				}
			}
		}

	}

}
