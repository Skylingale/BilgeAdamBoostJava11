package com.bilgeadam.week2.lecture5;

import java.util.Scanner;

public class question24 {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 ile 100 arasında (ikiside dahil)
		 * 5 adet sayı alınacak. Bu 5 sayıdan en büyük ve
		 * en küçük olanları yazdıran kodu yazın.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen bir sayı girin: ");
		int sayı=sc.nextInt();
		int min=Integer.MIN_VALUE; //100 soru için yeterli bu öğrenmek için
		int max=Integer.MAX_VALUE; //0 soru için yeterli
		int sayaç=1;
		
		while(sayaç<=5) {
			System.out.println("Lütfen bir sayı girin: ");
			sayı=sc.nextInt();
			
			if(sayı>=0 && sayı<=100) {
				if(sayı>max) {
					max=sayı;
				}
				if(sayı<min) { /*Burada else if demiyoruz çünkü
				else if olursa sadece tutmadığında yapıyor, ama biz her
				seferinde ikiside baksın istiyoruz ki ilk durumda hem min
				hem max sayı olarak atanabilsin
				*/
					min=sayı;
				}
				sayaç++;
			} else {
				System.err.println("Lütfen geçerli bir sayı girin!");
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);

	}

}
