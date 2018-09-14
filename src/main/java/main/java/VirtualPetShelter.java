package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

	private String petName;
	private HashMap<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	
	public void VirtualPetShelter() {
		
	}
	Scanner input = new Scanner(System.in);
	
	public void addNewPet() {
		System.out.println("What is the pet's name? ");
		petName = input.nextLine();
		pets.put(petName, new VirtualPet(petName, 100, 100, 100));
		
	}
	
	public HashMap<String, VirtualPet> getPetsMap() { //this is what is confusing me most
		return pets;									//i probably won't use this since it just returns the hashMap
	}
	
	public Collection <VirtualPet> getPetsValues(){ //even more useless
		return pets.values();
	}
	
	public VirtualPet getPet (String petName) { //this is the thing to understand the most
		return pets.get(petName);				//this is the most useful. i think it gets the name so you can chain link methods
	}
	
}
