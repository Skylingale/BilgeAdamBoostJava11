package com.bilgeadam.week4.lecture2;

public class Question47 {

	public static void main(String[] args) {
		/** Dışarıdan 10 sayısı girilecek. ilk metoda parametre olarak 10 sayısını vererek;
		1- 10+50
		2- (10+50) *30
		3- ((10+50)*30)-40
		4- (((10+50)*30)-40)/20 işlemlerini yaptıracağız.
		Bunu tek bir satırda metotların içerisine metotlar geçirerek yapacağız.
		**/
		
		double sonuc=yirmiyeBol(kirkCikart(otuzlaCarp(elliEkle(152))));
		System.out.println(sonuc);
		
	}
	
	private static int elliEkle(int sayi) {
		return sayi+50;
	}
	
	private static int otuzlaCarp(int sayi) {
		return sayi*30;
	}
	
	private static int kirkCikart(int sayi) {
		return sayi-40;
	}
	
	private static double yirmiyeBol(int sayi) {
		return sayi/20.0;
	}

}
