package com.master;

public class MasterTest {

	public static void main(String[] args) {
		Human human = new Human();
		human.readStats();
		human.attack(human);
		human.readStats();
	}

}
