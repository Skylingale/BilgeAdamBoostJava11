package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		/*
		 * girilen sayının basamakları toplamını ekrana yazdıralım
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int i = scanner.nextInt();
		int toplam = 0;
		int basamak = 0;
		while (i != 0) {
			toplam += i % 10;
			i /= 10;
			basamak++;

		}
		System.out.println("Basamak Sayısı: " + basamak + "\nBasamak Sayıları toplamı: " + toplam);
		/*
		 * yada do { toplam+=sayı%10; sayı/=10; sayaç++; }while(sayı!=0);
		 * System.out.println("Basamak Sayıları Toplamı: "+toplam);
		 * System.out.println("Basamak Sayısı: "+basamak);
		 */
	}

}
