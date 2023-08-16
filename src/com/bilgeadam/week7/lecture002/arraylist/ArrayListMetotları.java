package com.bilgeadam.week7.lecture002.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetotları {
	
	public static void main(String[] args) {
		
		List<String> sehirler=new ArrayList<>();
		//ArrayList<String> sehirler2=new Arraylist<>();
		
		//Listeye eleman ekleme
		sehirler.add("Ankara");
		sehirler.add("Adana");
		sehirler.add("Antalya");
		sehirler.add("İzmir");
		sehirler.add("Çanakkale");
		sehirler.add("Balıkesir");
		sehirler.add("Hatay");
		sehirler.add("Eskişehir");
		
		//Listeyi gezme
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		//Listeden eleman çıkarma
		//sehirler.remove(0); //index'e göre eleman çıkarma
		sehirler.remove("Adana"); //index değerine göre eleman çıkarma
		System.out.println("-------------------");
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		//Listenin belirli bir indeksine eleman ekle
		sehirler.add(5,"Adana");
		System.out.println("-------------------");
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		//Tüm listeyi temizleme
//		sehirler.clear();
//		for(String sehir:sehirler) {
//			System.out.println(sehir);
//		}
		
		//Listenin elemanlarına erişim
		System.out.println("-------------------");
		sehirler.get(0);
		System.out.println("Seçtiğiniz şehir: "+sehirler.get(7));
		
		sehirler.set(6, "İskenderun");
		System.out.println("-------------------");
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		//listenin boyutuna erişme
		System.out.println("-------------------");
		System.out.println(sehirler.size());
		
		//Liste içerisinde kontrol ve arama yapma.
		sehirler.contains("Ankara");
		System.out.println(sehirler.contains("Ankara"));
		sehirler.indexOf("Ankara");
		System.out.println(sehirler.indexOf("Ankara"));//eğer girilen eleman yok ise -1 döner indexOf
		sehirler.lastIndexOf("Ankara");
		System.out.println(sehirler.lastIndexOf("Ankara"));//girilen elemanın olduğu son indexi getirir
		
		
		//Sublist
		sehirler.subList(3, 7);
		System.out.println(sehirler.subList(3, 7));//listedeki belirli bir aralığın getirilmesini sağlar
												   //başlangıç index değerini getirir bitiş index değerini getirmez
												   //bu örnek 3,4,5 ve 6. indexlerin verilerini görüntüler
		
		//Dönüştürmeler
		String[]arraySehirler=sehirler.toArray(new String[sehirler.size()]);//Arraylist to Array
		
		System.out.println("--------------------");
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		List<String> sehirler2=new ArrayList<>();
		sehirler2.add("Trabzon");
		sehirler2.add("Rize");
		sehirler2.add("Artvin");
		
		sehirler.addAll(sehirler2);//bir listeyi başka bir listenin içine aktarma
		
		System.out.println("---------------------");
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
	}			

}
