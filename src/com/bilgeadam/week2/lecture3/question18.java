package com.bilgeadam.week2.lecture3;

import java.util.Scanner;

public class question18 {

	public static void main(String[] args) {
		/*
		 * telefon kodu ve email kodu tanımlayacağız kullanıcı email ve telefon kodu
		 * girmesini isteyeceğiz hem sms hem e mail kodu hatalıysa bir çıktı.
		 * 
		 * sms doğru, email kodu yanlış ise farklı bir çıktı. sms yanlış, e mail kodu
		 * doğru ise farklı bir çıktı. hepsi doğruysa "Giriş yaptınız".
		 */
		int emailkod = 123;
		int smskod = 321;
		System.out.println("Lütfen email'e gelen kodu ve telefonunuza gelen kodu giriniz.");
		Scanner scanner = new Scanner(System.in);
		int emaildeneme = scanner.nextInt();
		int smsdeneme = scanner.nextInt();
		if (smskod != smsdeneme && emailkod == emaildeneme)
			System.out.println("Girdiğiniz email kodu doğru, sms kodu yanlıştır.");

		else if (emailkod != emaildeneme && smskod == smsdeneme)
			System.out.println("Girdiğiniz sms kodu doğru, email yanlıştır.");

		else if (emailkod != emaildeneme && smskod != smsdeneme)
			System.out.println("Hem email kodu hemde sms kodu hatalıdır.");

		else
			System.out.println("Giriş yaptınız.");

	}

}
