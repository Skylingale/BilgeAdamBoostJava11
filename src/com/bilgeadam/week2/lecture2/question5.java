package com.bilgeadam.week2.lecture2;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// int integerSayı= scanner.nextInt();

		System.out.print("Lütfen bir sayı giriniz: ");
		double doubleSayı = scanner.nextDouble();// "\n"
		// scanner ile sayısal bir değer okuduktan sonra string
		// bir değer okumak istiyorsak mutlaka 1 tane boş
		// scanner.nextline(); kullanamız gerekir
		scanner.nextLine();

		double ikincisayı = 5;
		System.out.println(doubleSayı + ikincisayı);

		System.out.print("Lütfen adınızı giriniz: ");
		String isim = scanner.nextLine();
		isim = scanner.nextLine();
	}

}
