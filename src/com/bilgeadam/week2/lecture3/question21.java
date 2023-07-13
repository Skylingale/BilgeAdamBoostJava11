package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question21 {

	public static void main(String[] args) {
		/*
		 * Kullanıcı 1 ile 7 arasında (1 ile 7 dahil) bir sayı girsin. Bu sayıya denk
		 * gelen haftanın gününü yazalım
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.err.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
		}
		sc.close();

	}

}
