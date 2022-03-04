package com.ces.demo;

interface I1 {
	default void show() {
		System.out.println(" I am in I1...");
	}
}

interface I2 {
	default void show() {
		System.out.println(" I am in I2...");
	}
}
class Aa implements I1 {
	
	@Override
	public void show() {
		System.out.println(" I am in Aa show...");
	}
	
}
public class DefaultTest  {

	public static void main(String[] args) {
		//DefaultTest ob = new DefaultTest();
		Aa ob = new Aa();
		ob.show();
		

	}

}
