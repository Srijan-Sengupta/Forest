package com.sriijan.java.forest;

public class Lion extends Animal {
	
	private static Lion lion;
	
	private Lion(){
		System.out.println("Only one lion is can live in this Forest.");
	}
	
	public static Lion bringLion(){
		if(lion == null){
			lion = new Lion();
		}
		return lion;
	}
	
	

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("I roar.");
	}

}
