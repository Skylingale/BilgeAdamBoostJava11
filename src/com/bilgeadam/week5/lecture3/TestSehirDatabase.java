package com.bilgeadam.week5.lecture3;

import java.util.Scanner;
import com.bilgeadam.week5.lecture3.SehirDatabase;

public class TestSehirDatabase {

	public static void main(String[] args) {
		//Soru 1: Dışarıdan girilen harfle başlayan şehirleri yazdır
		//Soru 2: "01-Adana" formatında, illeri plaka kodları ile yazdıran method.
		//Soru 3: Girdiğimiz şehrin ismine göre plakasını dönen method.
		
		SehirDatabase sehirDB=new SehirDatabase();
		String[]iller=sehirDB.iller;
		
		//ilk soru için bu harfleBaslayanIller(iller);
		//ikinci soru için bu plakaYazdir(iller);
		sehirdenPlakaYazdir(iller);
	}
	public static void harfleBaslayanIller(String[]iller) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir harf giriniz: ");
		String harf=sc.nextLine();
		for(int i=0;i<iller.length;i++) {
			if(iller[i].startsWith(harf.toUpperCase())) {
				System.out.println(iller[i]);	
			}
			
		}
		if(harf.length()>1) {
			System.out.println("Lütfen sadece bir harf giriniz!");
		}
	}
	public static void plakaYazdir(String[]iller) {
		for(int i=0;i<iller.length;i++) {
			if(i<9) {
				System.out.println("0"+(i+1)+"-"+iller[i]);
			}else {
				System.out.println((i+1)+"-"+iller[i]);
			}
		}
	}
	public static void sehirdenPlakaYazdir(String[]iller) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir şehir ismi giriniz: ");
		String sehir=sc.nextLine();
		for(int i=0;i<iller.length;i++) {
			if(iller[i].equalsIgnoreCase(sehir)) {
				if(i<9) {
					System.out.println("0"+(i+1));
				}else {
					System.err.println(i+1);
				}
			}
		}
		
	}
//	public static String sehirdenPlakaYazdir2(String[]iller) {
//		
//		return;
//	}

}
