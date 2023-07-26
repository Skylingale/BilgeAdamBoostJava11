package com.bilgeadam.week4.lecture2;

public class Question48 {
	/* Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
	int[] array = { 1, 5, -4, 3 };
	*/
	
	//Math.abs()-> PARENTEZ İÇİNE GİRİLEN İŞLEMİN/DEĞERİN MUTLAK DEĞERİNİ ALIR!!
	public static void main(String[] args) {
		int fark=0;
		int min=Integer.MAX_VALUE;
		int[]array= {1,5,-4,3};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				fark=Math.abs(array[i]-array[j]);
				if(fark<min) {
					min=fark;
				}
			}
		}
		System.out.println(min);

	}

}
