package com.bilgeadam.week3.lecture1;

import java.util.Scanner;

public class question29 {

	public static void main(String[] args) {
		/*
		 * Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		 *   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		 *   eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		 * 
		 * 
		 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		 * içerisinde o harf varsa değiştirsin
		 * 
		 *
		 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		 * olmadığını bulunuz(kek,iki,kabak)
		 * 
		 * 
		 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde)  a lar için bir sayfaya b ler  bir sayfaya  cler bir
		 * sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
		 * sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
		 * sayfa oluğunu ekrana yazdıralım
		 * *
		 */
		boolean kontrol = true;
		int seçim;
		Scanner sc=new Scanner(System.in);
		while(kontrol) {
		System.out.println("MENÜ");
		System.out.println();
		System.out.println("1- Kelimenin içindeki harf sayısı");
		System.out.println("2- Girilen kelimedeki harfi değiştirme");
		System.out.println("3- Girilen kelimenin ters yazılımı ve polindrom kontrolü");
		System.out.println("4- Girilen 5 adet kelimenin a, b, c ile başlaması kontrolü");
		System.out.println("0- Ç I K I Ş");
		System.out.print("Seçiniz: ");
		seçim = sc.nextInt();
		//Soru 1
		switch (seçim) {
		case 1:{
		System.out.println("Lütfen bir kelime girin: ");
		String kelime=sc.nextLine();
		sc.nextLine();
		System.out.println("Lütfen bir harf girin: ");
		String harf=sc.next();
		char h=harf.charAt(0);
		int sayaç=0;
		for (int i=0; i<kelime.length();i++) {
			if (kelime.charAt(i)==h) {
				sayaç++;
				System.out.println(kelime.indexOf(i));
				System.out.println("Yazdığınız cümledeki" + harf + "sayısı: "+sayaç);
			}else {System.out.println("Aradığınız harf yok.");
			}break;
			}
		}
			
		
	    case 2:
	    System.out.println("Lütfen bir kelime girin: ");
	    String kelime2=sc.nextLine();
	    sc.nextLine();
	    System.out.println("Lütfen girdiğiniz kelimedeki değiştirmek istediğiniz harfi girin: ");
	    String harf2=sc.next();
	    char h2=harf2.charAt(0);
	    sc.nextLine();
	    System.out.println("Lütfen girdiğiniz harfin değiştirilmesini istediğiniz harfi giriniz: ");
	    String harf3=sc.next();
	    char h3=harf3.charAt(0);
	    kelime2=kelime2.replace(h2, h3);
	    System.out.println(kelime2);
	    break;
	    
		
	    case 3: {
	    	System.out.println("Lütfen bir kelime girin: ");
	    	String kelime=sc.nextLine();
	    	String ters="";
	    	for(int i=kelime.length()-1;i>=0;i--) {
	    		ters+=kelime.toLowerCase().equals(ters);
	    		System.out.println();
	    	}
	    	if(kelime.toLowerCase().equals(ters)) {
	    		System.out.println("Kelimeniz palindromdur.");
	    }else {
	    	System.out.println("Kelimeniz palindorm değildir.");
	    }
	    }
	    	//yada
	    	  /*int right=kelime.length()-1;
	    	  int left=0;
	    	  
	    	  boolean isPalindrome=true;
	    	  while(left<right) {
	    		  if(kelime.charAt(left)!=kelime.charAt(right)) {
	    			  isPalindrome=false;
	    		  }
	    		  left++;
	    		  right--;
	    	  }
	    	  if(isPalindrome) {
	    		  System.out.println("Palindromdur.");
	    	  }else {
	    		  System.out.println("Palindrom değildir.");
	    	  }
	    	 */
	    	
	    	
	    
	    case 4:{
	    	int a=0,b=0,c=0,d=0,toplam=0;
	    	System.out.println("\nSayfa açma");
	    	System.out.println("Lütfen 5 adet kelime giriniz: ");
	    	for(int i=0;i<5;i++) {
	    		System.out.println((i+1)+". kelimeyi giriniz: ");
	    		String kelime=sc.nextLine();
	    		if(kelime.charAt(0)=='a') {
	    			a=1;
	    		}else if(kelime.charAt(0)=='b') {
	    			b=1;
	    		}else if(kelime.charAt(0)=='c') {
	    			c=1;
	    		}else {
	    			d+=1;
	    		}
	    		toplam=a+b+c+d;
	    		System.out.println("Toplam dosya sayısı:"+toplam);
	    	}
	    }
		}

	}

}
}
