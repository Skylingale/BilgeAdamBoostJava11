package com.bilgeadam.week4.lecture2;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		//Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

		//2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

		//eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri metoda geçelim.

		//main'de dışarıdan kaç sayı alacağımızı belirliyoruz, o sayılara göre koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan birisini çağıracağız.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen sayı adedi giriniz: ");
		int sayiAdedi=sc.nextInt();
		
		switch(sayiAdedi) {
		
		case 2:
			System.out.println("Toplam= "+topla());
			break;
		case 3:
			System.out.println("Lütfen birinci sayıyı giriniz: ");
			int sayi1=sc.nextInt();
			System.out.println("Lütfen ikinci sayıyı giriniz: ");
			int sayi2=sc.nextInt();
			System.out.println("Lütfen üçüncü sayıyı giriniz: ");
			int sayi3=sc.nextInt();
			System.out.println("Toplam="+topla(sayi1,sayi2,sayi3));
			break;
			default:
				System.out.println("Çıkış yaptınız.");
		}
		sc.close();
	}
	
	private static int topla() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı giriniz: ");
		int sayi1=sc.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int sayi2=sc.nextInt();
		sc.close();
		return sayi1+sayi2;
	}
	
	private static int topla (int sayi1,int sayi2,int sayi3) {
	
		return sayi1+sayi2+sayi3;
}
}
