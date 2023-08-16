package com.bilgeadam.week7.lecture001.abstractionornek;

public class Motorsiklet extends Tasit{

	@Override
	void hizlan() {
		System.out.println("Motor hızlandı.");
		
	}

	@Override
	void frenYap() {
		System.out.println("Motor fren yaptı.");
		
	}

	@Override
	void vitesDegistir() {
		System.out.println("Motor vites değiştirdi.");
		
	}

	@Override
	void ozellikleriGoster() {
		System.out.println("Motor özelliklerini Veysel'e sorun.");
		
	}

	@Override
	void akrobatikHareketYap() {
		System.out.println("Motor havada takla attı sürücü çok havalı!");
	}
	
	

}
