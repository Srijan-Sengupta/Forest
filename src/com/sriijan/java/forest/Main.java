package com.sriijan.java.forest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forest forest = Forest.getCreated();
		
		System.out.println();
		System.out.println("I am a Lion.Only one Lion can live in a Forest.");
		forest.getLion().makeSound();
		System.out.println();
		
		System.out.println("I am a Banyan tree.");
		forest.getBanyanTree1().height();
		System.out.println();
		
		System.out.println("I am an Elephant.");
		forest.getElephant1().makeSound();
		System.out.println();
		
		System.out.println("I am grass.");
		forest.getGrass().height();
		System.out.println();
		
		Plant banyanTree3 = new BanyanTree();
		forest.addPlant(banyanTree3);
		
		
		
		
		
	}

}
