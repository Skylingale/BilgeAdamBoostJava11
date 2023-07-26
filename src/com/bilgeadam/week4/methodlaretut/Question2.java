package com.bilgeadam.week4.methodlaretut;

public class Question2 {
	/*
	* int[] alperen = {5,10,25,10,500,1000}
	* int[] muhammet = {10,15,1000,300,1200}
	* int[] ugurcan = {2000}
	* 2000 tl ve üzeri sepet tutarına ulaşanlara %10 indirim.
	* 2500 tl ve üzeri sepet tutarına ulaşanlara %12.5 indirim.
	* sepetinde 1000 tl ve üzeri ve 5 üründen fazla ürün olan 
	* kullanıcılara ekstra %5 indirim.
	*/

	public static void main(String[] args) {
	 int[] alpo = {5,10,25,10,500,1000};
	 int[] muho = {10,15,1000,300,1200};
	 int[] ugurcano = {2000};
	 
	 totalFiyat(alpo);
	 totalFiyat(muho);
	 totalFiyat(ugurcano);


	}
	public static int[] totalFiyat(int[] fiyat) {
		int total=0;
		int[]array=new int[2];
		for (int i=0;i<fiyat.length;i++) {
			total+=fiyat[i];
			array[0]=total;
		}
		System.out.println(total);
		array[1]=fiyat.length;
		return array; //int[] alpo = {5,10,25,10,500,1000};
	}
	
	public static double indirim(int fiyat) {
		double indirimOran=0;
		if(fiyat >=2000&&fiyat<2500) {
			indirimOran=0.1;
			return fiyat*indirimOran;
		}else if(fiyat>=2500) {
			indirimOran=0.125;
			return fiyat*indirimOran;
		}else {
			return fiyat;
		}
	}

}
