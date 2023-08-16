package com.bilgeadam.week5.lecture5.encapsulation;

public class Araba {
	
	String marka;
	String model;
	int km;
	int bijonSayisi;
	String camSil;
	
	public void arabayiSur() {
		System.out.println("Araba kullanılıyor.");
	}
	
	public void ozellikleriYazdir() {
		System.out.println("Marka: "+this.marka);
		System.out.println("Model: "+this.model);
		System.out.println("Km: "+this.km);
		System.out.println("Bijon Sayısı: "+this.bijonSayisi);
		System.out.println("Camsil: "+this.camSil);
	}
	
	
	public Araba() {
		super();
	}

	public Araba(String marka, String model, int km, int bijonSayisi, String camSil) {
		super();
		this.marka = marka;
		this.model = model;
		this.km = km;
		this.bijonSayisi = bijonSayisi;
		this.camSil = camSil;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getBijonSayisi() {
		return bijonSayisi;
	}

	public void setBijonSayisi(int bijonSayisi) {
		this.bijonSayisi = bijonSayisi;
	}

	public String getCamSil() {
		return camSil;
	}

	public void setCamSil(String camSil) {
		this.camSil = camSil;
	}
	
	
	
	

}
