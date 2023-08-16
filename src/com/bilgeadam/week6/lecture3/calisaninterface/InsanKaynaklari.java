package com.bilgeadam.week6.lecture3.calisaninterface;

public class InsanKaynaklari extends Calisan implements IInsanKaynaklari{
	
	public InsanKaynaklari(String isim,String soyisim){
		super(isim,soyisim);
	}
	public InsanKaynaklari(String isim,String soyisim,double maas){
		super(isim,soyisim,maas);
	}
	
	@Override
	public void zamYap(Calisan calisan,double zamOrani) {
		double zamliUcret=calisan.getMaas()+(calisan.getMaas()*zamOrani/100);
		if(calisan.getClass().getSimpleName().equals("Mühendis")) {
			zamliUcret+=250;
		}
	}
	
	
}
