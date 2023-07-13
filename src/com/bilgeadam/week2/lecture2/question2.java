package com.bilgeadam.week2.lecture2;

public class question2 {

	/*
	 * Bir ürünün fiyatında %18 KDV ve %15 Kar olduğunu biliyoruz Ürün fiyatı 100
	 * olsun. Bu ürün fiyatımdan ham fiyatı bulmak istiyorum.
	 */

	public static void main(String[] args) {
		double ürünfiyat = 100;
		double hamfiyat = 0, karfiyat = 0;
		karfiyat = 100 / 1.18;
		hamfiyat = karfiyat / 1.15;
		System.out.println("KDVsiz fiyat:" + karfiyat);
		System.out.println("Ham fiyat: " + hamfiyat);

	}

}
