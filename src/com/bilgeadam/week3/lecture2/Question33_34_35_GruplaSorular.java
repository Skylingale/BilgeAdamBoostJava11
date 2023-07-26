package com.bilgeadam.week3.lecture2;

import java.util.Scanner;

public class Question33_34_35_GruplaSorular {

	public static void main(String[] args) {
		// dizide en büyük ve en küçük öğeyi bulma
		// 0, 120, 5, 85, -256, 16, 1258, 81, 14 dizi elemanlarım.
		
		boolean kontrol = true;
		int seçim;
		Scanner sc=new Scanner(System.in);
		while(kontrol) {
		System.out.println("MENÜ");
		System.out.println();
		System.out.println("1- En büyük ve en küçük sayı");
		System.out.println("2- En büyük 2. sayıyı bulma");
		System.out.println("3- Soru 3");
		System.out.println("0- Ç I K I Ş");
		System.out.print("Seçiniz: ");
		seçim = sc.nextInt();
		
		switch(seçim) {
		case 1:{
		int[]sayılar= {0,120, 5, 85, -256, 16, 1258, 81, 14};
		int ebys=sayılar[0];
		int ekçs=sayılar[0];
		for(int i=1;i<sayılar.length;i++) {
			if(ebys<sayılar[i]) {
				ebys=sayılar[i];
			}if(ekçs>sayılar[i]) {
				ekçs=sayılar[i];
			}
		}
		
		System.out.println("Girdiğiniz sayılardan en büyüğü: "+ebys);
		System.out.println("Girdiğiniz sayılardan en küçüğü: "+ekçs);
			break;
		}
		case 2:{
		int[]sayılar={1300, 120, 130, 125, -256, 16, 1258, 81, 14};
		int ebys=sayılar[0];
		int ebys2=sayılar[0];
        ebys = Integer.MIN_VALUE;
        ebys2 = Integer.MIN_VALUE;

        for (int i = 0; i < sayılar.length; i++) {
            if (sayılar[i] > ebys) {
                ebys2 = ebys;
                ebys = sayılar[i];
            } else if (sayılar[i] > ebys2 && sayılar[i] < ebys) {
                ebys2 = sayılar[i];
            }
        }
        System.out.println("En büyük ikinci sayı: " + ebys2);
            break;
		}
		case 3:{
		   	int[] dizi = { 2, -256, 2, 1258, 2, 2 };
			boolean kontrol1 = false;

			for (int i = 0; i < dizi.length - 1; i++) {
				if (dizi[i] == 2 && dizi[i + 1] == 2) {
					kontrol1 = true;
					break;
				}
			}

			if (kontrol1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			
			
			
			
			break;
		}
		}
		}
	}
}
            
		
		
			
		