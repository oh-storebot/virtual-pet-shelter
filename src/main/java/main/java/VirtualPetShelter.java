package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

	private String petName;
	private String petDescription;
	private HashMap<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void VirtualPetShelter() {

	}

	Scanner input = new Scanner(System.in);

	public void addNewPet() {
		System.out.println("What is the pet's name? ");
		petName = input.nextLine();
		System.out.println("Describe your pet");
		petDescription = input.nextLine();
		pets.put(petName, new VirtualPet(petName, petDescription, 100, 100, 100));

	}

	public void petToAdopt() {
		System.out.println("Which pet would you like to adopt?");
		String petToAdopt = input.nextLine();
		pets.remove(petToAdopt);
	}

	public HashMap<String, VirtualPet> getPetsMap() { // this is what is confusing me most
		return pets; 
	}

	public Collection<VirtualPet> getPetsValues() {
		return pets.values();
	}

	public VirtualPet getPet(String petName) { // this is the thing to understand the most
		return pets.get(petName); // this is the most useful. i think it gets the name so you can chain link
									// methods
	}

}
