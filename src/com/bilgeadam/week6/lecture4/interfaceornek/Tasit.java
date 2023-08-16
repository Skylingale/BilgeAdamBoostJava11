package com.bilgeadam.week6.lecture4.interfaceornek;

public class Tasit implements IHareket{

	@Override
	public void ilerle() {
		System.out.println("Taşıt ilerliyor.");
		
	}

	@Override
	public void dur() {
		System.out.println("Taşıt duruyor.");
		
	}
	
	

}
