package com.bilgeadam.week4.lecture3;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen bir tek sayı giriniz: ");
		int sayi=sc.nextInt();
		System.out.println("Lütfen satır sayısını girin: ");
		int satir=sc.nextInt();
		System.out.println("Lütfen sütun sayısını girin: ");
		int sutun=sc.nextInt();
		
		printArray(sayi,satir,sutun);

	}
	
	public static void printArray(int max, int satir, int sutun) {
		
		int min=1;
		int orta=(max+min)/2;
		int[][]array=new int[satir][sutun];
		
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(i==j) {
					array[i][j]=orta;
				}else if(i<j) {
					array[i][j]=max;					
				}else {
					array[i][j]=min;
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
	}	

}
