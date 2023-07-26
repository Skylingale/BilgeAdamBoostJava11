package com.bilgeadam.week4.methodlaretut;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Ali->{15,20,8,50,30}
		 * Veli->{5,15}
		 * Ayşe->{100,50,10,15,20,30,50}
		 */
		int[]Ali= {15,20,8,50,30};
		int[]Veli={5,15};
		int[]Ayse={100,50,10,15,20,30,50};
//		int toplam1=0;
//		int toplam2=0;
//		int toplam3=0;
//		//int toplam=toplam1+toplam2+toplam3;
//		for(int i=0;i<Ali.length;i++) {
//			toplam1+=Ali[i];
//		}
//		System.out.println("Ali'nin ücreti: "+toplam1);
//		for(int j=0;j<Veli.length;j++) {
//			toplam2+=Veli[j];
//		}
//		System.out.println("Veli'nin ücreti: "+toplam2);
//		for(int k=0;k<Ayse.length;k++) {
//			toplam3+=Ayse[k];
//		}
//		System.out.println("Ayşe'nin ücreti: "+toplam3);
//		System.out.println("Ali, Veli ve Ayşe'nin toplam ücreti: "+(toplam1+toplam2+toplam3));
		int aliAdisyon=adisyon(Ali);
		adisyon(Veli);
		adisyon(Ayse);
		double taxRate=0.18;
		
		double AliNetAdisyon=(aliAdisyon*taxRate)+aliAdisyon;
		
		System.out.println(ikiSayiTopla(aliAdisyon,vergiMiktariHesapla(aliAdisyon)));
	}
	
	public static int adisyon(int[] fis) {
		int total=0;
		for (int i=0;i<fis.length;i++) {
			total+=fis[i];
		}
		System.out.println(total);
		return total;
	}
	public static double vergiMiktariHesapla(int fiyat) {
		double taxRate=0.18;
		return taxRate*fiyat;
	}
	public static double ikiSayiTopla(int fiyat, double vergiliKisim) {
		return fiyat+vergiliKisim;
	}

}
