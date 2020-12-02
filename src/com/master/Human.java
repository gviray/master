package com.master;

public class Human {
	private int strength;
	private int intelligence;
	private int stealth;
	private int health;

	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public void readStats() {
		System.out.println("Strength " + strength);
		System.out.println("intelligence " + intelligence);
		System.out.println("stealth " + stealth);
		System.out.println("health " + health);
	}
	
	public void attack(Human human) {
		human.health = (health - strength);
	}
}
