package com.bilgeadam.week2.lecture5;

import java.util.Scanner;

public class question26 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir String girdisi olsun
		 * bu string'in her bir harfini bulunduğu index ile birlikte
		 * alt alta yazdıralım
		 */
		Scanner sc=new Scanner(System.in);
		int sayaç=0;
		System.out.println("Bir cümle giriniz: ");
		String cümle=sc.nextLine();
		do {
			System.out.println(sayaç+" "+cümle.charAt(sayaç));
			sayaç++;
		}
		while (sayaç<cümle.length());
		sc.close();
	}

}