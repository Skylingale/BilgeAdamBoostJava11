package com.bilgeadam.week2.lecture5;

import java.util.Scanner;

public class question23 {

	public static void main(String[] args) {
		// girilen sayı mükemmel mi değil mi bulan kod
		Scanner sc=new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int i=sc.nextInt();
		int sayaç=1;
		int toplam=0;
		for(sayaç=1;sayaç<=i/2;sayaç++) {
			if(i%sayaç==0) {
				toplam+=sayaç;	
			} 
		}  if (toplam==i) {
			System.out.println(i+" Mükemmel sayıdır.");
		} else {
			System.out.println(i+" Mükemmel sayı değildir.");
		}
		
			
		

	}

}
