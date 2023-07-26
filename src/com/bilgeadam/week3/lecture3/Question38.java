package com.bilgeadam.week3.lecture3;

public class Question38 {

	public static void main(String[] args) {
		// dizide 13 sayısına denk gelene kadar devam edelim.
		// 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise.
		// 13'den sonra gelen sayıyı toplama ekleyelim
		// 1, 13, 13, 13, 5, 1
		int[]sayılar= {1, 13, 13, 13, 5, 13};
		int toplam=0;
		for(int i=0;i<sayılar.length-1;i++) {
			if(sayılar[i]==13 && sayılar[i+1]!=13) {
				toplam+=sayılar[i+1];
			}
			
			/*if(sayılar[i]==13) {
				toplam+=sayılar[i+1];
			 if(sayılar[i]==13 && sayılar[i+1]==13) {
				toplam-=sayılar[i];
			}
		}*/ //bu orjinal çözümümdü, işe yarıyor ama alperen hoca tek if'le dene daha kolay dedi

	}
		System.out.println(toplam);
	}

}
