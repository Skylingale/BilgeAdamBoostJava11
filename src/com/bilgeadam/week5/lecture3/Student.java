package com.bilgeadam.week5.lecture3;

public class Student {
	
	String isim;
	static int numara;
	
	public void kayit() {
		numara+=1;
				System.out.println(isim+" adlı öğrenci "+numara+" no'su ile kaydolmuştur.");
	}

}
