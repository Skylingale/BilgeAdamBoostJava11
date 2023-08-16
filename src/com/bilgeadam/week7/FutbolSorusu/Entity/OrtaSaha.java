package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.Random;

public class OrtaSaha extends Futbolcu{
	
	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;
	
	@Override
	public String toString() {
		return "OrtaSaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAdSoyad()=" + getAdSoyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	public OrtaSaha(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.uzunTop=randomFutbolcuYetenek();
		this.ilkDokunus=randomFutbolcuYetenek();
		this.topSurme=randomFutbolcuYetenek();
		this.uretkenlik=randomFutbolcuYetenek();
		this.ozelYetenek=randomFutbolcuYetenek();
	}
	
	@Override
	public int randomFutbolcuYetenek() {
		Random random=new Random();
		return random.nextInt(60,101);
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

}
