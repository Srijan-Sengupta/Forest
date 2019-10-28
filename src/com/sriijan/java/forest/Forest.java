package com.sriijan.java.forest;

import java.util.*;

public class Forest {
	
	private static Forest instantiate;
	
	private Animal lion;
	private Animal elephant1;
	private Animal elephant2;
	
	private Plant banyanTree1;
	private Plant banyanTree2;
	private Plant grass;
	
	private List<Animal> listOfAnimals;
	private List<Plant> listOfPlants;
	
	private Forest(){
		
		System.out.println("A Forest has been created.");
		System.out.println();
		
		lion = Lion.bringLion();
		elephant1 = new Elephant();
		elephant2 = new Elephant();
		banyanTree1 = new BanyanTree();
		banyanTree2 = new BanyanTree();
		grass = new Grass();
		listOfAnimals = new ArrayList<>();
		listOfPlants = new ArrayList<>();
		
		listOfAnimals.add(elephant1);
		listOfAnimals.add(elephant2);
		listOfAnimals.add(lion);
		
		listOfPlants.add(grass);
		listOfPlants.add(banyanTree1);
		listOfPlants.add(banyanTree2);
		
	}
	
	
	
	public static Forest getCreated(){
		
		if(instantiate == null){
			instantiate = new Forest();
		}
		
		return instantiate;
		
	}



	public Animal getLion() {
		return lion;
	}



	public void setLion(Animal lion) {
		this.lion = lion;
	}



	public Animal getElephant1() {
		return elephant1;
	}



	public void setElephant1(Animal elephant) {
		this.elephant1 = elephant;
	}



	public Animal getElephant2() {
		return elephant2;
	}



	public void setElephant2(Animal elephant2) {
		this.elephant2 = elephant2;
	}



	public Plant getBanyanTree1() {
		return banyanTree1;
	}



	public void setBanyanTree1(Plant banyanTree1) {
		this.banyanTree1 = banyanTree1;
	}



	public Plant getBanyanTree2() {
		return banyanTree2;
	}



	public void setBanyanTree2(Plant banyanTree2) {
		this.banyanTree2 = banyanTree2;
	}



	public Plant getGrass() {
		return grass;
	}



	public void setGrass(Plant grass) {
		this.grass = grass;
	}



	public List<Animal> getListOfAnimals() {
		return listOfAnimals;
	}



	public void setListOfAnimals(List<Animal> listOfAnimals) {
		this.listOfAnimals = listOfAnimals;
	}



	public List<Plant> getListOfPlants() {
		return listOfPlants;
	}



	public void setListOfPlants(List<Plant> listOfPlants) {
		this.listOfPlants = listOfPlants;
	}
	
	public void addAnimals(Animal animal){
		this.listOfAnimals.add(animal);
		
	}
	
	public void removeAnimal(Animal animal){
		this.listOfAnimals.remove(animal);
	}
	
	public void addPlant(Plant plant){
		this.listOfPlants.add(plant);
		
	}
	
	public void removePlant(Plant plant){
		this.listOfPlants.remove(plant);
	}
}
