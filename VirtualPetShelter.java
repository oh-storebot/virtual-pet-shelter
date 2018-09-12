package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

	private String petName;
	private ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();
	
	Scanner input = new Scanner(System.in);
	
	public void addNewPet() {
		System.out.println("What is the pet's name? ");
		petName = input.nextLine();
		VirtualPet pet = new VirtualPet(petName, 100,100,100);
		
	}
	
	
	
	
	
}
