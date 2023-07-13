package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
		/*
		 * telefon kodu ve email kodu tanımlayacağız kullanıcı email ve telefon kodu
		 * girmesini isteyeceğiz
		 * 
		 */
		int email_kodu = 123;
		int tel_kodu = 321;
		System.out.println("Lütfen email'e gelen kodu ve telefonunuza gelen kodu giriniz.");
		Scanner scanner = new Scanner(System.in);
		int email_deneme = scanner.nextInt();
		int tel_deneme = scanner.nextInt();
		if (email_kodu != email_deneme) {
			System.out.println("Girdiğiniz email kodu hatalıdır.");
		}
		if (tel_kodu != tel_deneme) {
			System.out.println("Girdiğiniz sms kodu hatalıdır.");
		}
		if (tel_kodu == tel_deneme && email_kodu == email_deneme) {
			System.out.println("Giriş yaptınız.");

		}

	}

}
