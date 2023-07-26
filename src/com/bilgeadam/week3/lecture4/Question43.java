package com.bilgeadam.week3.lecture4;

public class Question43 {

	public static void main(String[] args) {
		/*
		 * Bir method yazalım ve bu method dizi içindeki tek elemanları
		 * alıp başka bir diziye atsın ve o diziyi yazdırsın.
		 * int[][] matris={{56,23,678,231,5},{234,21,78,26,6},{654,33,32,67,2},
		 * {189,35,56,89,8}};
		 */
		
		int[][] matris={{56,23,678,231,5},{234,21,78,26,6},{654,33,32,67,2},
				{189,35,56,89,8}}; //4x5'lik bir matris
		tekSayılarıAta(matris);
	}
	
	public static void tekSayılarıAta(int[][] ikiBoyutluArray) {
		int[]array=new int[ikiBoyutluArray.length*ikiBoyutluArray[0].length];
		int sayaç=0;
		
		for(int i=0;i<ikiBoyutluArray.length;i++) {
			for(int j=0;j<ikiBoyutluArray[i].length;j++) {
				if(ikiBoyutluArray[i][j]%2!=0) {
					array[sayaç]=ikiBoyutluArray[i][j];
					sayaç++;
				}
			}	
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" - ");
		}
	}
	
	/*
	 * Return type'lar;
	 * 
	 * void-> boş döner
	 * int-> integer döner
	 * String-> String döner
	 * int[]->integer array döner
	 * 
	 * Şu ana kadar çalıştığımız bütün veri tipleri birer return
	 * type olarak kullanılabilir
	 */

}
