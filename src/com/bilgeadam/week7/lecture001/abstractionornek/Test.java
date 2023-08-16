package com.bilgeadam.week7.lecture001.abstractionornek;

public class Test {

	public static void main(String[] args) {
		/*
		 * Taşıt superclass'ı olacak. Bu class abstract bir sınıf olacak.
		 * 
		 * marka
		 * model
		 * maksHız
		 * vites
		 * hızlan();
		 * frenYap();
		 * vitesDeğiştir();
		 * özellikleriGöster();
		 * akrobatikHareketYap();
		 * 
		 * Bu taşıt sınıfından miras alan araba ve motosiklet isimli iki sınıf oluşturalım
		 */
		
		Araba araba=new Araba();
		Motorsiklet motor=new Motorsiklet();
		
		araba.hizlan();
		araba.frenYap();
		araba.vitesDegistir();
		araba.ozellikleriGoster();
		araba.akrobatikHareketYap();
		System.out.println();
		motor.hizlan();
		motor.frenYap();
		motor.vitesDegistir();
		motor.ozellikleriGoster();
		motor.akrobatikHareketYap();
	}

}
