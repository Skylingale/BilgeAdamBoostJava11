package com.bilgeadam.week7.lecture001.abstractionornek;

public abstract class Tasit {
	private String marka;
	private String model;
	private int maksHiz;
	private int vites;
	
	public Tasit(String marka, String model, int maksHiz, int vites) {
		super();
		this.marka = marka;
		this.model = model;
		this.maksHiz = maksHiz;
		this.vites = vites;
	}
	
	public void hizlan() {
		
	}
	
	abstract void hizlan();
	abstract void frenYap();
	abstract void vitesDegistir();
	abstract void ozellikleriGoster();
	abstract void akrobatikHareketYap();
	
}
