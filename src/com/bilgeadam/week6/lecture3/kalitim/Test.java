package com.bilgeadam.week6.lecture3.kalitim;

public class Test {
	
	public static void main(String[] args) {
		OfisCalisani ofisCalisani=new OfisCalisani("Berke","Yıldırımer");
		System.out.println(ofisCalisani.getIsim()+" "+ofisCalisani.getSoyisim());
		System.out.println(ofisCalisani.getMaas());
		//ofisCalisani.setUnvan(ofisCalisani.getMaas());
		ofisCalisani.zamYap(0);
		System.out.println(ofisCalisani.getUnvan());
		ofisCalisani.zamYap(50);
		System.out.println(ofisCalisani.getUnvan());
		
		
		
	}

}
