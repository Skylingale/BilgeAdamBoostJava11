package com.bilgeadam.week2.lecture5;

import java.util.Scanner;

public class question27 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir değer alacağız, bu aldığımız değerin içerisinde kaç tane "a" harfi olduğunu bize döndürecek bir program.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir cümle giriniz: ");
		String cümle=sc.nextLine();
		char a='a';
		int sayaç=0;
		for (int i=0; i<cümle.length();i++) {
			if (cümle.charAt(i)==a) {
				sayaç++;
			}
		}
		System.out.println("Yazdığınız cümledeki a sayısı: "+sayaç);
		
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
