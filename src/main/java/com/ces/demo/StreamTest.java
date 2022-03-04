package com.ces.demo;

interface A {
	void show();
}

class B implements A {

	@Override
	public void show() {

		System.out.println("I am in show method...");

	}
}

public class StreamTest {

	public static void main(String[] args) {

		/*A obj = new B();
		obj.show();*/
		
		/*A obj = new A() {
			public void show() {

				System.out.println("I am in show method of inner...");

			}
		};
		obj.show();*/
		
		A obj =() -> System.out.println("I am in show method of lamda...");		
	
		obj.show();

	}

}
