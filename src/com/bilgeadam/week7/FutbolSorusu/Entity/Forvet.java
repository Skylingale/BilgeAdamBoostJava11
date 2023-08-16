package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.Random;

public class Forvet extends Futbolcu{
	
	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	public Forvet(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.bitiricilik=randomFutbolcuYetenek();
		this.ilkDokunus=randomFutbolcuYetenek();
		this.kafa=randomFutbolcuYetenek();
		this.ozelYetenek=randomFutbolcuYetenek();
	}
	
	@Override
	public int randomFutbolcuYetenek() {
		Random random=new Random();
		return random.nextInt(70,101);
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

}
