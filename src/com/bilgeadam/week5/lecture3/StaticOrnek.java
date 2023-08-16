package com.bilgeadam.week5.lecture3;

public class StaticOrnek {
	
	int number=0;//nesne değişkeni
	static int number2=0;//sınıf değişkeni

	public static void main(String[] args) {
		StaticOrnek staticOrnek=new StaticOrnek();
		
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		staticOrnek=new StaticOrnek();
		staticOrnek.numaraVer();
		StaticOrnek staticOrnek2=new StaticOrnek();
		System.out.println(staticOrnek2.number+" "+staticOrnek2.number2);
	}
	public void numaraVer() {
		number+=1;
		number2+=1;
		System.out.println("number1: "+number);
		System.out.println("number2: "+number2);
	}

}
