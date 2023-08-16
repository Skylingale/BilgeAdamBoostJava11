package com.bilgeadam.week5.lecture3;

public class TestDatabase {

	public static void main(String[] args) {

		Database database=new Database();
		database.kullanicilariOlustur();
		Kullanici[]kullanicilar=database.kullaniciListesi;
		
		for(int i=0;i<kullanicilar.length;i++) {
			if(kullanicilar[i]!=null) {
				System.out.println(kullanicilar[i].isim+" "+kullanicilar[i].id);
			}
		}
		Database database2=new Database();
		for(int i=0;i<database2.kullaniciListesi.length;i++) {
			if(kullanicilar[i]!=null) {
				System.out.println(kullanicilar[i].isim+" "+kullanicilar[i].id);
			}
		}	

	}

}
