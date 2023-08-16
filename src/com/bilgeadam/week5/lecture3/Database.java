package com.bilgeadam.week5.lecture3;

public class Database {

	Kullanici[] kullaniciListesi=new Kullanici[5];
	int uzunluk=1;
	public void kullanicilariOlustur() {
		
		Kullanici kullanici=new Kullanici();
		kullanici.isim="Berke";
		kullanici.email="berkekral@hotmail.com";
		kullanici.sifre="123";
		kullanici.id=uzunluk+1;
		uzunluk++;
		
		Kullanici kullanici2=new Kullanici();
		kullanici2.isim="Alperen";
		kullanici2.email="alperen@hotmail.com";
		kullanici2.sifre="123";
		kullanici2.id=uzunluk+1;
		uzunluk++;
		
		Kullanici kullanici3=new Kullanici();
		kullanici3.isim="Uğur";
		kullanici3.email="uğur@hotmail.com";
		kullanici3.sifre="123";
		kullanici3.id=uzunluk+1;
		uzunluk++;
	}
}
