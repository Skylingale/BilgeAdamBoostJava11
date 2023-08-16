package com.bilgeadam.week7.lecture001.abstractionornek2;

public abstract class GeometrikSekil {
	
	private String renk;
	private final double PI=3.14;
	
	public void ciz() {
		System.out.println("Çizilen şekil "+renk+" renkli."+getClass().getSimpleName());
	}
	
	public abstract alanHesapla();
	

}
