package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class Ödev1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int toplam = 0, sayaç = 1;
		double ort = 0;
		System.out.println("Sayı giriniz.");
		int sayı = scanner.nextInt();

		/*
		 * while (sayı!=){ toplam+=sayı; ort=toplam/sayaç;
		 * System.out.println("Sayı giriniz."); number=scanner.nextInt; sayaç++;
		 */

		for (sayaç = 1; sayı != 0; sayaç++) {
			toplam += sayı;
			ort = (double) toplam / (sayaç);
			System.out.println("Sayı giriniz.");
			sayı = scanner.nextInt();
		}
		System.out.println("Toplam: " + toplam + " Ortalama: " + ort);
	}

}
