package com.bilgeadam.week7.lecture002.arraylist.arraylistornekler;

import java.util.ArrayList;
import java.util.List;

public class ArrayOrnek1 {
	
	public static void main(String[] args) {
		
	
	/*
	 * String bir arraylist
	 * 
	 * Ankara
	 * Antalya
	 * Bolu
	 * Artvin
	 * Ankara
	 * Antalya
	 * Erzurum
	 * Karaman
	 * Ankara
	 * 
	 * "an" ile baslayan sehirleri listeden cikaralim.
	 * 
	 * 
	 */
	
	List<String> sehirler=new ArrayList<>();
	sehirler.add("Ankara");
	sehirler.add("Antalya");
	sehirler.add("Bolu");
	sehirler.add("Artvin");
	sehirler.add("Ankara");
	sehirler.add("Antalya");
	sehirler.add("Erzurum");
	sehirler.add("Karaman");
	sehirler.add("Ankara");
	
//	ÇÖZÜM 1
//	for(int i=0;i<sehirler.size();i++) {
//		if(sehirler.get(i).startsWith("An")) {
//			sehirler.remove(i);
//			i--;
//		}
//	}
//	for(String sehir:sehirler) {
//		System.out.println(sehir);
//	}
//-------------------------------------------------
//	ÇÖZÜM 2
//	for(int i=sehirler.size()-1;i>=0;i--) {
//		if(sehirler.get(i).startsWith("An")) {
//			sehirler.remove(i);
//		}
//	}
//	for(String sehir:sehirler) {
//		System.out.println(sehir);
//	}
//--------------------------------------------------
//	ÇÖZÜM 3
//	for(int i=0;i<sehirler.size();i++) {
//		if(sehirler.get(i).startsWith("An")) {
//			sehirler.remove(i);
//			sehirler.add(i, "XXX");
//		}
//	}
//	for(String sehir:sehirler) {
//		System.out.println(sehir);
//	}
//--------------------------------------------------
//	ÇÖZÜM 4
//	for(int i=0;i<sehirler.size();i++) {
//		if(sehirler.get(i).startsWith("An")) {
//			sehirler.set(i, "XXX");
//		}
//	}
//	for(String sehir:sehirler) {
//		System.out.println(sehir);
//	}
//---------------------------------------------------
//	ÇÖZÜM 5
	for(String sehir:sehirler) {
		if(sehir.startsWith("An")) {
			sehirler.set(sehirler.indexOf(sehir),"XXX");
		}
	}
	for(String sehir:sehirler) {
		System.out.println(sehir);
	}
	
	
	}

}
