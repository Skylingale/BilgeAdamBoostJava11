package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question20 {

	public static void main(String[] args) {
		/*
		 * Girilen sayı 5'in kuvveti mi değil mi bulan program
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int i = sc.nextInt();
		boolean kontrol = true;

		if (i == 1) {
			System.out.println("Sayı 5'in kuvvetidir!");
			kontrol = false;
		} else if (i < 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz.");
			kontrol = false;
		}
		while (kontrol) {
			if (i % 5 == 0) {
				i = i / 5;
				if (i == 1) {
					System.out.println("Sayı 5'in kuvvetidir");
					kontrol = false;
				}
			} else {
				System.out.println("Sayı 5'in kuvveti değildir!");
				kontrol = false;
			}
		}

	}

}
