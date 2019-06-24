package com.objectmaster.human;

public class Human {
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	int health = 100;
	
	public void displayHealth() {
		System.out.println("Human - Health: " + health);
	}
	
	public int attackHuman(int atk) {
		System.out.println("Human has been attacked");
		health = health - (atk*strength);
		return health; 
	}

}
