package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.Random;

public class Defans extends Futbolcu{
	
	int pozisyonAlma;
	int kafa;
	int sicrama;
	
	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma=randomFutbolcuYetenek();
		this.kafa=randomFutbolcuYetenek();
		this.sicrama=randomFutbolcuYetenek();
	}
	
	@Override
	public int randomFutbolcuYetenek() {
		Random random=new Random();
		return random.nextInt(60,91);
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

}
