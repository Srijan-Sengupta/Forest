package com.sriijan.java.forest;

public abstract class Animal {
	
	private int noOflimbs = 4;
	
	public  void move(){
		System.out.println("I can move in all directions.");
	}
	
	public abstract void makeSound();

	public int getNoOflimbs() {
		return noOflimbs;
	}
	
	

}
