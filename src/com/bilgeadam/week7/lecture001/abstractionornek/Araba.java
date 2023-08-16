package com.bilgeadam.week7.lecture001.abstractionornek;

public class Araba extends Tasit{

	@Override
	void hizlan() {
		System.out.println("Araba hızlandı.");
		
	}

	@Override
	void frenYap() {
		System.out.println("Araba fren yaptı.");
		
	}

	@Override
	void vitesDegistir() {
		System.out.println("Araba vites değiştirdi.");
		
	}

	@Override
	void ozellikleriGoster() {
		System.out.println("Araba özellikleri için Veysel lazım.");
		
	}

	@Override
	void akrobatikHareketYap() {
		System.out.println("Araba takla attı sürücü öldü.");
	}
	
	

}
