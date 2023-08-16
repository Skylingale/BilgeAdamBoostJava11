package com.bilgeadam.week5.lecture4;

public class Database {

	static Kullanici[] kullaniciListesi=new Kullanici[5];
	static int uzunluk=0;
	
	public static void kullaniciEkle(Kullanici kullanici) {
		if(uzunluk<kullaniciListesi.length) {
			kullaniciListesi[uzunluk]=kullanici;
			uzunluk++;
		}
		if(uzunluk>=kullaniciListesi.length-2) {
			listeBoyutunuArttir();
			
		}
	}
	
	private static void listeBoyutunuArttir() {	
		Kullanici[]tmp=new Kullanici[kullaniciListesi.length+5];
		for(int i=0;i<kullaniciListesi.length;i++) {
			tmp[i]=kullaniciListesi[i];
		}
		kullaniciListesi=tmp;
		
	}
	
	public static boolean kullaniciVarMi(String[]array) {
		int sayac=0;
		for(int i=0;i<kullaniciListesi.length;i++) {
			if(kullaniciListesi[i].email.equalsIgnoreCase(array[0])) {
				if(kullaniciListesi[i].sifre.equals(array[1])) {
					System.out.println("Başarıyla sisteme girdiniz.");
					sayac=0;
					return true;
				}else {
					sayac++;
					if(sayac==3) {
						System.err.println("3 defa hatalı giriş yaptınız.");
						return false;
					}else {
						System.out.println("Şifre hatalı.");
						return false;
					}
				}
			}else {
				System.out.println("Email hatalı.");
				return false;
			}
		}		
		return false;
	}


}
