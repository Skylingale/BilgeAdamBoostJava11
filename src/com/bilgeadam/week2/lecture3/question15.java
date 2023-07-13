package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz 0 girildiğinde
		 * sayıların toplamını ve ortalamasını ekrana yazdıralım
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz: ");
		int sayaç = 1;
		int toplam = 0;
		double ortalama = 0;
		int i = scanner.nextInt();
		while (i != 0) {
			toplam += i;
			ortalama = toplam / (double) sayaç;
			System.out.print("Lütfen sayı giriniz: ");
			i = scanner.nextInt();
			sayaç++;
		}
		System.out.println("Toplam: " + toplam + " Ortalama: " + ortalama);

	}

}
