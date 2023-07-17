package com.bilgeadam.week2.lecture5;

import java.util.Scanner;

public class question22 {

	public static void main(String[] args) {
		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
	    // burc hesabı yapan program
	    // Koç Burcu : 21 Mart - 20 Nisan
	    // Boğa Burcu : 21 Nisan - 21 Mayıs
	    // İkizler Burcu : 22 Mayıs - 22 Haziran
	    // Yengeç Burcu : 23 Haziran - 22 Temmuz
	    // Aslan Burcu : 23 Temmuz - 22 Ağustos
	    // Başak Burcu : 23 Ağustos - 22 Eylül
	    // Terazi Burcu : 23 Eylül - 22 Ekim
	    // Akrep Burcu : 23 Ekim - 21 Kasım
	    // Yay Burcu : 22 Kasım - 21 Aralık
	    // Oğlak Burcu : 22 Aralık - 21 Ocak
	    // Kova Burcu : 22 Ocak - 19 Şubat
	    // Balık Burcu : 20 Şubat - 20 Mart
		Scanner sc=new Scanner(System.in);
		System.out.print("Lütfen ayı belirtin: ");
		int ay=sc.nextInt();
		System.out.print("Lütfen günü belirtin: ");
		int gün=sc.nextInt();
		
		switch (ay) {
		case 1:
			if(gün >=1 && gün<=21) {
				System.out.println("Burcunuz Oğlak.");
			} else if(gün>31 || gün<1) {
				System.err.println("Ocak ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Kova.");
			}
			break;
		case 2:
			if(gün >=1 && gün<=19) {
				System.out.println("Burcunuz Kova.");
			} else if(gün>29 || gün<1) {
				System.err.println("Şubat ayı 29 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Balık.");
			}
			break;
		case 3:
			if(gün >=1 && gün<=20) {
				System.out.println("Burcunuz Balık.");
			} else if(gün>31 || gün<1) {
				System.err.println("Mart ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Koç.");
			}
			break;
		case 4:
			if(gün >=1 && gün<=21) {
				System.out.println("Burcunuz Koç.");
			} else if(gün>30 || gün<1) {
				System.err.println("Nisan ayı 30 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Boğa.");
			}
			break;
		case 5:
			if(gün >=1 && gün<=21) {
				System.out.println("Burcunuz Boğa.");
			} else if(gün>31 || gün<1) {
				System.err.println("Mayıs ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz İkizler.");
			}
			break;
		case 6:
			if(gün >=1 && gün<=22) {
				System.out.println("Burcunuz İkizler.");
			} else if(gün>30 || gün<1) {
				System.err.println("Haziran ayı 30 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Yengeç.");
			}
			break;
		case 7:
			if(gün >=1 && gün<=22) {
				System.out.println("Burcunuz Yengeç.");
			} else if(gün>31 || gün<1) {
				System.err.println("Temmuz ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Aslan.");
			}
			break;
		case 8:
			if(gün >=1 && gün<=22) {
				System.out.println("Burcunuz Aslan.");
			} else if(gün>31 || gün<1) {
				System.err.println("Ağustos ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Başak.");
			}
			break;
		case 9:
			if(gün >=1 && gün<=22) {
				System.out.println("Burcunuz Başak.");
			} else if(gün>30 || gün<1) {
				System.err.println("Eylül ayı 30 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Terazi.");
			}
			break;
		case 10:
			if(gün >=1 && gün<=22) {
				System.out.println("Burcunuz Terazi.");
			} else if(gün>31 || gün<1) {
				System.err.println("Ekim ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Akrep.");
			}
			break;
		case 11:
			if(gün >=1 && gün<=21) {
				System.out.println("Burcunuz Akrep.");
			} else if(gün>30 || gün<1) {
				System.err.println("Kasım ayı 30 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Yay.");
			}
			break;
		case 12:
			if(gün >=1 && gün<=21) {
				System.out.println("Burcunuz Yay.");
			} else if(gün>31 || gün<1) {
				System.err.println("Aralık ayı 31 gündür, girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Oğlak.");
			}
			break;
		}
		sc.close();
		
	}
}
