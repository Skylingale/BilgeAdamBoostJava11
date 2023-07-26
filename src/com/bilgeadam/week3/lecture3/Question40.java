package com.bilgeadam.week3.lecture3;

public class Question40 {

	public static void main(String[] args) {
		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı ise
		 * ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise bilgeadam yazdıralım. int start=2; int
		 * end=22;
		 */
		int start=2, end=22;
		String[]array=new String[end-start+1];
		for(int i=0;i<array.length;i++) {
			int sayı=i+start;
			if(sayı%15==0) {
				array[i]="BilgeAdam";
			}else if(sayı%5==0){
				array[i]="Adam";
			}else if(sayı%3==0) {
				array[i]="Bilge";
			}else {
				array[i]=""+sayı;
			}
		}
		
		for(int j=0;j<array.length;j++) {
			if(j==array.length-1){
				System.out.println(array[j]);
			}else {
				System.out.println(array[j]+",");
			}
		}

	}

}
