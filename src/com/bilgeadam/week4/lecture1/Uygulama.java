package com.bilgeadam.week4.lecture1;

import java.util.Scanner;

public class Uygulama {
	
	static Scanner sc = new Scanner(System.in);

	public static void uygulama() {
		boolean status=true;
		while(status) {
			menu();
			switch(islemSec()) {
			
			case 1:
				System.out.println("İşlemin sonucu= "+toplama());
				
				break;
			case 2:
				System.out.println("İşlemin sonucu= "+cikarma());
				
				break;
			case 3:
				System.out.println("İşlemin sonucu= "+carpma());
				
				break;
			case 4:
				System.out.println("İşlemin sonucu= "+bolme());
				
				break;
			case 5:
				
				break;
			case 0:
				
				break;
		}
	}

		menu();

	}

	public static void menu() {

			System.out.println("HESAP MAKİNESİ");
			System.out.println("1-Toplama");
			System.out.println("2-Çıkarma");
			System.out.println("3-Çarpma");
			System.out.println("4-Bölme");
			System.out.println("5-EBOB VE EKOK");
			System.out.println("0-ÇIKIŞ");
		}
		
		public static  int islemSec() {
			System.out.println("Lütfen bir işlem seçiniz: ");
			int secim=sc.nextInt();
			sc.nextLine();
			return secim;
			
		}
		
		public static int toplama() {
			System.out.println("\n TOPLAMA İŞLEMİ");
			int islemSonucu=0;
			String sayi="";
			while(!sayi.equals("=")) {
				System.out.println("Lütfen bir sayı giriniz: ");
				sayi=sc.nextLine();
				if(sayi.equals("=")) {
					return islemSonucu;
				}else {
					islemSonucu+=Integer.parseInt(sayi);
			}
			}
			return 0;
		}
		
		public static int cikarma() {
			System.out.println("\n ÇIKARMA İŞLEMİ");
			int islemSonucu=0;
			int count=0;
			String sayi="";
			while(!sayi.equals("=")) {
				System.out.println("Lütfen bir sayı giriniz: ");
				sayi=sc.nextLine();
				if(!sayi.equals("=") && count==0) {
					islemSonucu=Integer.parseInt(sayi);
				}
				else if(sayi.equals("=")) {
					return islemSonucu;
				}else {
					islemSonucu-=Integer.parseInt(sayi);
			}
			}
			return 0;
		}
		
		public static int carpma() {
			System.out.println("\n ÇARPMA İŞLEMİ");
			int islemSonucu=1;
			String sayi="";
			while(!sayi.equals("=")) {
				System.out.println("Lütfen bir sayı giriniz: ");
				sayi=sc.nextLine();
				if(sayi.equals("=")) {
					return islemSonucu;
				}else {
					islemSonucu*=Integer.parseInt(sayi);
			}
			}
			return 0;
		}
		
		public static int bolme() {
			System.out.println("\n BÖLME İŞLEMİ");
			int islemSonucu=1;
			String sayi="";
			while(!sayi.equals("=")) {
				System.out.println("Lütfen bir sayı giriniz: ");
				sayi=sc.nextLine();
				if(sayi.equals("=")) {
					return islemSonucu;
				}else {
					islemSonucu-=Integer.parseInt(sayi);
			}
			}
			return 0;
		}

}
