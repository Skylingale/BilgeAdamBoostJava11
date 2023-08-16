package com.bilgeadam.week7.FutbolSorusu;

import com.bilgeadam.week7.FutbolSorusu.Entity.Futbolcu;
import com.bilgeadam.week7.FutbolSorusu.Entity.Takim;

public class Runner {

	public static void main(String[] args) {
		
		Takim takim1=new Takim("Takim 1");
		System.out.println("Takım 1");
		for(Futbolcu futbolcu:takim1.getOyuncular()) {
			System.out.println(futbolcu);
		}
		System.out.println("**************************************************************************************************");
		System.out.println("**************************************************************************************************");
		System.out.println("**************************************************************************************************");
		Takim takim2=new Takim("Takim 2");
		System.out.println("Takım 2");
		for(Futbolcu futbolcu:takim2.getOyuncular()) {
			System.out.println(futbolcu);
		}

	}

}
