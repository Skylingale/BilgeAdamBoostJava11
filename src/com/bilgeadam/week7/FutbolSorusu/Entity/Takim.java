package com.bilgeadam.week7.FutbolSorusu.Entity;

import java.util.ArrayList;
import java.util.List;

public class Takim implements ITakim{
	
	private String ad;
	List<Futbolcu> oyuncular;
	private Kaleci kaleci;
	
	@Override
	public String toString() {
		return "Takim [ad=" + ad + ", oyuncular=" + oyuncular + ", kaleci=" + kaleci + "]";
	}

	public Takim(String ad) {
		this.oyuncular=new ArrayList<>();
		this.ad = ad;
		this.kaleci=new Kaleci("Kaleci",1);
		defansOlustur();
		ortaSahaOlustur();
		forvetOlustur();
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Futbolcu> getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(List<Futbolcu> oyuncular) {
		this.oyuncular = oyuncular;
	}

	public Kaleci getKaleci() {
		return kaleci;
	}

	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}

	@Override
	public void defansOlustur() {
		for(int i=0;i<4;i++) {
			Defans defans=new Defans("Defans "+(i+1), (i+2));
			oyuncular.add(defans);
		}	
	}

	@Override
	public void ortaSahaOlustur() {
		for(int i=0;i<4;i++) {
			OrtaSaha ortaSaha=new OrtaSaha("Orta Saha "+(i+1),(i+2));
			oyuncular.add(ortaSaha);
		}		
	}

	@Override
	public void forvetOlustur() {
		for(int i=0;i<2;i++) {
			Forvet forvet=new Forvet("Forvet "+(i+1),(i+10));
			oyuncular.add(forvet);
		}		
	}

}
