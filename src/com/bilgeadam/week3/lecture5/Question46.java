package com.bilgeadam.week3.lecture5;

import java.util.Scanner;

public class Question46 {


		//Türkçe karakterleri İngilizce karakterlere çevirme

		/**

		*Bir method yazalım. method arraylerimizin ikisini de alsın.

		*daha sonra methodun içinde bir string değer alalım.

		*sonra Türkçe karakterleri İngilizce karakterlere dönüştürüp
		*dönüştürülmüş hali geri dönelim.

		*döndüğümüz String değerini main methodta yazdıralım.

		*/
	public static void main(String[] args) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		
		
		System.out.println(changeString(ingilizceKarakter,turkceKarakter));//bu sıralama önemli yoksa ingilizce karakteri türkçeye çevirebilir
	}
	
	public static String changeString(String[] eng, String[] tr) {
		
		Scanner sc=new Scanner(System.in);
		String kelime=sc.nextLine();
		
		for(int i=0;i<tr.length;i++) {
			kelime=kelime.replace(tr[i], eng[i]);
		}
		return kelime;
	}

}
