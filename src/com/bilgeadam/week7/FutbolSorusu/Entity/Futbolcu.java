package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.Random;

public class Futbolcu {
	
	private String adSoyad;
	private int formaNo;
	private int dayaniklilik;
	private int hiz;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlilik;
	private int dogalForm;
	private int sans;
	
	public Futbolcu(String adSoyad, int formaNo) {
		super();
		this.adSoyad = adSoyad;
		this.formaNo = formaNo;
		this.dayaniklilik=randomFutbolcuYetenek();
		this.hiz=randomFutbolcuYetenek();
		this.pas=randomFutbolcuYetenek();
		this.sut=randomFutbolcuYetenek();
		this.yetenek=randomFutbolcuYetenek();
		this.kararlilik=randomFutbolcuYetenek();
		this.dogalForm=randomFutbolcuYetenek();
		this.sans=randomFutbolcuYetenek();
	}
	
	public int randomFutbolcuYetenek() {
		Random random=new Random();
		return random.nextInt(50,101);
	}

	public String getAdSoyad() {
		return adSoyad;
	}
	
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getYetenek() {
		return yetenek;
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public int getKararlilik() {
		return kararlilik;
	}

	public void setKararlilik(int kararlilik) {
		this.kararlilik = kararlilik;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}

}
