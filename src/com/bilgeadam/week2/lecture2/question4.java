package com.bilgeadam.week2.lecture2;

public class question4 {

	/*
	 * İki tane string değişken oluşturalım. İsim ve soyisim olsun. Sonra bu
	 * değişkenleri bir şekilde ekrana yazdıralım.
	 * 
	 * a ve b karakterlerinin değerini yazdırın. Sonrada karakter değer toplamını
	 * yazdırın.
	 */

	public static void main(String[] args) {
		String isim, soyisim, isimsoyisim;
		isim = "Berke";
		soyisim = "Yıldırımer";
		isimsoyisim = "İsim: " + isim + " Soyisim: " + soyisim;
		System.out.println(isimsoyisim);
		// System.out.println("İsim Soyisim: " + isim + soyisim);
		// System.out.println("İsim: " + isim);
		// System.out.println("Soyisim: " + soyisim);
		System.out.println("###Alt Satır Kırılımı####");
		System.out.println("İsim: " + isim + "\nsoyisim: " + soyisim);

		System.out.println("###TAB girdisi###");
		System.out.println("isim:\t" + isim + "soyisim:\t" + soyisim);

		char a = 'a', b = 'b';
		int toplam = a + b;
		System.out.println(toplam); // benim çözüm
		// yada
		System.out.println('a' + 'b'); // hocam çözümü
	}

}
