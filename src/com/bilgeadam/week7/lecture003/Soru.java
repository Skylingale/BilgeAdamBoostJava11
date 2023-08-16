package com.bilgeadam.week7.lecture003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 * 
		 * 1tane tek sayilar 1 tane çift sayılar için bir liste olusturalim
		 * 
		 * sonra 35 tane random sayiyi çift ise çiftlere tek ise teklere atalim
		 * 
		 * en sonunda tekler ve çiftler listesini yazdiralim
		 */
		
		List<Integer> tekSayilar=new ArrayList<>();
		List<Integer> ciftSayilar=new ArrayList<>();
		for(int i=0;i<35;i++) {
			int sayi=randomSayi();
			if(sayi%2==0) {
				ciftSayilar.add(sayi);
			}else {
				tekSayilar.add(sayi);
			}
		}
			
		System.out.println("Tek Sayılar Listesi: "+tekSayilar);
		System.out.println("Çift Sayılar Listesi: "+ciftSayilar);

	}
	
	public static int randomSayi(){
		Random random=new Random();
		return random.nextInt(500);
	}

}
