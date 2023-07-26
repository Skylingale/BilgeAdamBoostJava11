package com.bilgeadam.week3.lecture2;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		/*
		 * Dışardan girilen ülke ismi array'de var mı
		 * 
		 * Arraydeki ülkeler: Türkiye, Japonya, Moğolistan, Amerika
		 * Rusya, Çin, UAE
		 */
		Scanner sc=new Scanner(System.in);
		String[]ülkeler= {"Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin", "UAE"};
		System.out.println("Lütfen bir ülke giriniz: ");
		String ülke=sc.nextLine();
		
		for(int i=0;i<ülkeler.length;i++) {
			if(ülkeler[i].equalsIgnoreCase(ülke)) {
				System.out.println("Girdiğiniz ülke dizimizde vardır.");
				break;
			}else if(i==ülkeler.length-1) {
				System.out.println("Girdiğiniz ülke dizimizde yoktur.");
			}
		}
		sc.close();
	}

}
