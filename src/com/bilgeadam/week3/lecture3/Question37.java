package com.bilgeadam.week3.lecture3;

public class Question37 {

	public static void main(String[] args) {
		/*
		 * 
		 * int [] sayilar={1,4,5,6,1,1,4,8};
		 * 
		 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
		 * adetinden büyükse true değilse false
		 * 
		 */
		int[]sayılar= {1,4,5,6,1,1,4,8};
		int adet1=0;
		int adet4=0;
		for(int i=0;i<sayılar.length;i++) {
			if(sayılar[i]==1) {
				adet1++;
			}else if(sayılar[i]==4) {
				adet4++;
			}
		}/*if(adet1>adet4) {
			System.out.println("True");
		}else
			System.out.println("False");
			*/ //bu benim yöntem ve doğru
		System.out.println(adet1>adet4); //bu daha basit ve kolayı

	}

}
