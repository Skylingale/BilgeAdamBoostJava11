package com.bilgeadam.week3.lecture3;

public class Question36 {

	public static void main(String[] args) {
		//dizideki bütün sayıların toplamını yazdıralım.
	    // dizinin her bir elemanı için;
		//çift ise çifttir, tek ise tektir yazdıralım.
        //0, 120, 5, 85, -256, 16, 1258, 81, 14
		int[]sayılar= {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int toplam=0;
		for(int i=0;i<sayılar.length;i++) {
			toplam+=sayılar[i];
			if(sayılar[i]%2==0) {
				System.out.println(sayılar[i]+" Çifttir.");
			}else if
				(sayılar[i]%2!=0) {
				System.out.println(sayılar[i]+" Tektir.");
			}
		}
		System.out.println("Sayılar toplamı: "+toplam);
	}

}
