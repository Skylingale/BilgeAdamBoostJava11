package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		/*
		 * 1'de başlayarak kullanıcının dışarda girdiği sayıya kadar olan (sayı dahil)
		 * sayıların 1 fazlasının toplamını ekrana yazdıran program
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int sayı = scanner.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayı; i++) {
			toplam += (i + 1);

		}
		System.out.println(toplam);
	}

}
/*
 * yada int sayı=scanner.nextInt(); int toplam= 0; int i=1;
 * 
 * while (i <= sayı) { toplam+=i+1; i++; } System.out.println(toplam) }
 */
