package com.bilgeadam.week3.lecture5;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		
		/*Soru 1 Bir method olsun, methodun içine 2 tane sayı alalım.
		Bu sayıları çarpıp çarpım değerini döndürelim.
		---------------------------------------------------------
		Soru 2 main metodumda bir sayı değeri olacak sayi=15
		bir de sonuc değeri olacak sonuc=0; aşağıda oluşturduğum
		metotlardan dönen değerleri sonuc = sayi/"metot" işleminde
		kullanmak istiyorum.
		*/
		
		int sonuc1=carpim();
		System.out.println("Sonuç: "+sonuc1);
		
		int sonuc2=carpim();
		System.out.println("Sonuç: "+sonuc2);
		
		int sayi=15;
		double sonuc3=0;
		int toplam=0;
		toplam=carpim();
		if(toplam==0) {
			System.out.println(sayi+"/"+ toplam +"işlemin sonucu tanımsızdır.");
		}else {
			sonuc3=(double)sayi/toplam;
			System.out.println(sayi+"/"+ toplam+ " = " +sonuc3);
		}
		
		if(carpim(1,15)==0) {
			System.out.println(sayi+"/"+ carpim(1,15) +"işlemin sonucu tanımsızdır.");	
		}else{
			sonuc3=(double)sayi/carpim();
			System.out.println(sayi+"/"+carpim(1,15)+" = "+sonuc3);
		}
		
		toplam=carpim2(ikiSayiAl());
		
		if (toplam==0) {
			System.out.println(sayi+"/");
		}
		
		sonuc3=(double) sayi/carpim(10,24);
		System.out.println("15/"+carpim(10,24)+" = "+sonuc3);
		
		
	}
	public static int[] ikiSayiAl() {
		int[]sayiArray=new int[2];
		
		System.out.println("Birinci sayıyı giriniz: ");
		sayiArray[0]=sc.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		sayiArray[1]=sc.nextInt();
		
		return sayiArray;
	}
	
	public static int carpim2(int[] sayilar) {
		return sayilar[0]*sayilar[1];
	}
	
	public static int carpim() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int sayi1=sc.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int sayi2=sc.nextInt();
		return sayi1*sayi2;
		
	}
	public static int carpim(int sayi1, int sayi2) {
		return sayi1*sayi2;
	}

}
