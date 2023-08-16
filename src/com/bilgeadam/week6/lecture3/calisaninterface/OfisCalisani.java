package com.bilgeadam.week6.lecture3.calisaninterface;

public class OfisCalisani extends Calisan{

	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8000);
	}
	public OfisCalisani(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
	}
	@Override
	public void setUnvan(double maas) {
		if(maas>=12000) {
			setUnvan("Kıdemli Çalışan");
		}else if(maas>=8000) {
			setUnvan("Çalışan");
		}else {
			setUnvan("Stajyer");
		}
	}
	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani));
		setUnvan(getMaas());
		return getMaas();
	}
	
	
	
	
	
	/**
	 * -- Mühendislerimiz olacak
	 * 
	 * isim soyiisim iş unvani maaşı enz az iki constructr istiyorum (isim soy isim)
	 * (isim soyisim maaş)
	 * 
	 * maaşş zammı metodu olacak
	 * 
	 * maaş default en az 10000 1000 12000 arası unvan muhendis eger maaşı
	 * 1200-17000 arasında ise kıdemlı muhendis 1700den yuksek ise uzman muhendis
	 * eğer maaaşı 1000 kucuk ise stajyer ve
	 * 
	 * zam oranına ek olarak 250tl bonus alacaklar
	 * 
	 * -- ofis çalışanları olacak
	 * 
	 * isim soyiisim iş unvani maaşı
	 * 
	 * en düşük çalışan maaşı 8000 8000 1200 arası çalışan 12000 den sonraı kidemli
	 * calıasan 8000den az ise stajyer
	 */
	
	
	
}
