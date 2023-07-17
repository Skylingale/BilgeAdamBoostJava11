package com.bilgeadam.week3.lecture1;

public class question28 {

	public static void main(String[] args) {
		/*
		 * =Java, React, Spring
		 * 
		 * split kullanmadan virgülden bölüp
		 * 
		 * bir for döngüsü içinde Java React Spring
		 */
		String yazı="Java,React,Spring";
		//çözüm 1
		int index=0;
		for(int i=0;i<yazı.length();i++) {
		    if(yazı.charAt(i) == ',') {
		    System.out.println(yazı.substring(index,i));
		    index=i+1;
		    }
		}
			
			System.out.println(yazı.substring(index));	
		System.out.println("************");
		//çözüm 2
		for(int i=0;i<yazı.length();i++) {
			if(yazı.charAt(i) == ',') {
				System.out.println();
			}else {
				System.out.print(yazı.charAt(i));
			}
		}
		    System.out.println();
		System.out.println("************");
		//çözüm 3
		yazı=yazı.replace(",", "\n");
		System.out.println(yazı);

	}

}
