package com.bilgeadam.week6.lecture3.calisaninterface;

public class Test {
	
	public static void main(String[] args) {
		OfisCalisani ofisCalisani=new OfisCalisani("Alperen","İkinci");
		System.out.println(ofisCalisani.getIsim()+" "+ofisCalisani.getSoyisim());
		System.out.println(ofisCalisani.getMaas());
		//ofisCalisani.setUnvan(ofisCalisani.getMaas());
		ofisCalisani.zamYap(0);
		System.out.println(ofisCalisani.getUnvan());
		ofisCalisani.zamYap(50);
		System.out.println(ofisCalisani.getUnvan());
		
		Calisan muhendis=new Muhendis("Berke","Yıldırımer");
		System.out.println(muhendis.getIsim()+" "+muhendis.getSoyisim());
		System.out.println(muhendis.getUnvan());
		muhendis.zamYap(20);
		System.out.println(muhendis.getMaas());
		System.out.println(muhendis.getUnvan());
		
		muhendis.maasAl();
		muhendis.izinAl();
		muhendis.fazlaMesaiYap();
		
		
	}

}
