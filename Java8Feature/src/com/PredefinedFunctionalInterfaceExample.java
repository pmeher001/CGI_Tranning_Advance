package com;


import java.util.function.Consumer;

class MyConumser implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("You pass the value as "+t);
	}
}
public class PredefinedFunctionalInterfaceExample {

	public static void main(String[] args) {
		Consumer<Integer> cc1  = new MyConumser();
		cc1.accept(100);
		
		System.out.println("Providing the body for Consumer using lambda style");
		
	Consumer<Integer> cc2 = (n)->System.out.println("You pass the vaue as lambda style "+n);
		cc2.accept(200);
	}

}