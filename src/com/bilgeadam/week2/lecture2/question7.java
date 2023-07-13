package com.bilgeadam.week2.lecture2;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		/*
		 * 2 sayısal değer al, sayıların toplamı çift ise true tek ise false yazdır
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz: ");
		int sayı1 = scanner.nextInt();
		System.out.print("2. Sayıyı giriniz: ");
		int sayı2 = scanner.nextInt();
		int toplam = sayı1 + sayı2;
		boolean kontrol = toplam % 2 == 0;
		System.out.println(kontrol);
		double ortalama = toplam / 2d;// virgüllü sonuç çıkması için bölenide double olarak belirt
		System.out.println("Ortalama: " + ortalama);
		scanner.close();

	}
}
