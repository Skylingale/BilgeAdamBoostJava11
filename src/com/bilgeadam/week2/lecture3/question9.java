package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		/*
		 * Girilen 1-10 arasındaki sayının çarpım tablosunu yazan bir program
		 * 
		 * örn 7 7x1 7x2 7x3 ... 7x10 gibi
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz: ");
		int sayı = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			int çarpım = sayı * i;
			System.out.println(sayı + "x" + i + "=" + çarpım);
		}
		/**
		 * if (sayı>1=1 && sayı <=10) { System.out.println(sayı + "'nin çarpım
		 * tablosu"); for (int i=1; i<=0; i++) { int çarpım = sayı*i;
		 * System.out.println(sayı + "x"+ i+ "=" + çarpım);
		 * 
		 * } else { System.out.println("Hatalı giriş yaptınız."); +" }
		 * 
		 * }
		 */

	}

}
