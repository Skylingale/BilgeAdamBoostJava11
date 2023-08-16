package com.bilgeadam.week6.lecture3.calisaninterface;

public class Muhendis extends Calisan{

	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
	}
	
	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
	}

	@Override
	public void setUnvan(double maas) {
		if(maas>=17000) {
			setUnvan("Uzman Mühendis");
		}else if(maas>=12000) {
			setUnvan("Kıdemli Mühendis");
		}else if(maas>=10000) {
			setUnvan("Kıdemli Mühendis");
		}else {
			setUnvan("Stajyer");
		}
	}

	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani)+250);
		setUnvan(getMaas());
		return getMaas();
	}
	
	
}
