package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question13 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan taban değeri ve üs isimli 2 değişken alınacak (2 üzeri 5 gibi)
		 * tabanın kuvvetini hesaplamak istiyoruz
		 * 
		 * Kullanıcıya ismi sorulacak. Aldığımız isim değişkeniyle birlikte sonucu
		 * yazdıracağız
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen taban değerini girin: ");
		int i = scanner.nextInt();
		System.out.println("Lütfen üs değerini girin: ");
		int j = scanner.nextInt();
		scanner.nextLine();
		int sayaç = 1;
		int sonuç = 1;

		while (sayaç <= j) {
			sonuç *= i;
			sayaç++;
		}

		System.out.println("Lütfen isminizi girin: ");
		String isim = scanner.next();
		System.out.println("Tabanın kuvveti: " + sonuç + " İsminiz: " + isim);
	}

}
