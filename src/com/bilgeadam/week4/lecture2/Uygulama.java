package com.bilgeadam.week4.lecture2;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		TasKagitMakas tkm=new TasKagitMakas();
		String[]array=tkm.tasKagitMakas;
		
		uygulama(array);

	}

	public static void uygulama (String[]array) {
		Scanner sc=new Scanner(System.in);
		String kontrol="";
		int userSkor=0;
		int pcSkor=0;
		do {
			String pcSecim=rastgeleSecim(array);
			String userSecim=userSecim();
			if(userSecim.equalsIgnoreCase(pcSecim)) {
				System.out.println("BERABERE!");
				System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);	
			}else {
				switch(userSecim) {
				case "taş": if(pcSecim.equalsIgnoreCase("kağıt")) {
					System.out.println("KAYBETTİNİZ!");
					pcSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}else {
					System.out.println("KAZANDINIZ!");
					userSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}
				break;
				case "kağıt": if(pcSecim.equalsIgnoreCase("makas")) {
					System.out.println("KAYBETTİNİZ!");
					pcSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}else {
					System.out.println("KAZANDINIZ!");
					userSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}
				break;
				case "makas": if(pcSecim.equalsIgnoreCase("taş")) {
					System.out.println("KAYBETTİNİZ!");
					pcSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}else {
					System.out.println("KAZANDINIZ!");
					userSkor++;
					System.out.println("Skorunuz: "+userSkor+"\nPcSkoru: "+pcSkor);
				}
				break;
				default:
					System.err.println("Lütfen geçerli bir değer giriniz.");
					break;
				}
			}	
			System.out.println("Tekrar oynamak için E harfine basın.");
			kontrol=sc.nextLine();
		}while(kontrol.equalsIgnoreCase("E"));
		System.err.println("Uygulama sonlandı.");
	}
	
	private static String userSecim() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen Taş-Kağıt-Makas değerlerinden birini giriniz.");
		String secim=sc.nextLine();
		return secim;
	}
	
	private static String rastgeleSecim(String[]array) {
		Random random=new Random();
		int sayi=random.nextInt(array.length);
		return array[sayi];
	}
}
