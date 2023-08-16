package com.bilgeadam.week5.lecture4;

import java.util.Scanner;

public class Uygulama {
	/*
	 * Menü:
	 * 1- Kayıt ol
	 * 2- Giriş yap
	 * 3- Kullanıcıları göster
	 * 4- Çıkış
	 * 
	 * 1- Menüyü oluşturalım
	 * 2- Menüden seçim yap
	 * 3- Yapılan seçime göre aksiyon alınabilecek bir tema oluştur
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void application() {
		
		int secim;
		do {
		menu();
		secim=secimYap();
		switch(secim) {
		case 1:
			kayitOl();
			break;
		case 2:
			girisYap();
			break;
		case 3:
			kullanicilariGoster();
			break;
		case 4:
			System.err.println("Uygulamadan çıkış yapıldı.");
			break;
		default:
			System.err.println("Lütfen geçerli bir seçim yapınız.");
		}		
	} while(secim!=4);
}
		
		
	private void menu() {
	
		System.out.println("Menü:");
		System.out.println("1-Kayıt ol");
		System.out.println("2-Giriş yap");
		System.out.println("3-Kullanıcıları göster");
		System.out.println("4-Çıkış");
		
	}
		
	private int secimYap() {
		System.out.print("Seçiniz: ");
		int secim=sc.nextInt();
		sc.nextLine();
		
		
		return secim;
	}
		

	

	private void kullanicilariGoster() {
		System.out.println("İsim\t|Email\t|ID");
		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
			if(Database.kullaniciListesi[i]!=null) {
		System.out.println(Database.kullaniciListesi[i].isim+"\t "+Database.kullaniciListesi[i].email+"\t "+Database.kullaniciListesi[i].id);
			}
		}
	}

	private String[] girisYap() {
		System.out.print("Lütfen email giriniz: ");
		String email=sc.nextLine();
		System.out.print("Lütfen şifre giriniz: ");
		String sifre=sc.nextLine();
		String[] hesap=new String[2];
		hesap[0]=email;
		hesap[1]=sifre;
		Database.kullaniciVarMi(hesap);
		return hesap;
		
	}

	private void kayitOl() {
	Kullanici kullanici=new Kullanici();
	System.out.print("Lütfen adınızı giriniz: ");
	kullanici.isim=sc.nextLine();
	System.out.println("Lütfen mailinizi giriniz: ");
	kullanici.email=sc.nextLine();
	System.out.println("Lütfen bir şifre giriniz: ");
	kullanici.sifre=sc.nextLine();
	kullanici.id=Database.uzunluk+1;
	Database.kullaniciEkle(kullanici);
	
		
		
	}

}
