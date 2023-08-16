package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.Random;

public class Kaleci extends Futbolcu{

	private int kurtaris;
	
	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtaris=randomFutbolcuYetenek();
	}
	
	@Override
	public int randomFutbolcuYetenek() {
		Random random=new Random();
		return random.nextInt(65,101);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}
	
}
