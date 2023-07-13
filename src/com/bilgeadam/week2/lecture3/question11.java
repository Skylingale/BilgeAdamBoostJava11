package com.bilgeadam.week2.lecture3;

public class question11 {

	public static void main(String[] args) {
		/*
		 * 1'den başlayarak gelen bütün sayıları toplayalım toplamımız 50'yi geçene
		 * kadar çalışsın en son toplamı yazdıralım ve bu döngünün kaç kere çalışacağını
		 * yazalım
		 * 
		 */
		// int sayaç = 0;
		int toplam = 0;
		int i = 0;
		while (toplam <= 50) {
			toplam += (i + 1);
			i++;
			// sayaç++;

		}
		System.out.println(toplam);
		System.out.println("Döngü sayısı: " + i);
	}

}
