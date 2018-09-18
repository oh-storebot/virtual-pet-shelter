package main.java;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// System.out.println("Test");
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();

		while (!input.equals("6")) {
			System.out.println("Choose and option");
			System.out.println("1. Feed your pets");
			System.out.println("2. Water your pets");
			System.out.println("3. Play with your pet");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Admit a pet");
			System.out.println("6. Quit");
			System.out.println("Name" + "\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Boredom");

			for (VirtualPet pet : shelter.getPetsValues()) {

				System.out.println(pet.getPetName() + "\t|" + pet.getHungerLevel() + "\t|" + pet.getThirstLevel()
						+ "\t|" + pet.getBoredomLevel());
			}
			String menuOption = input.nextLine();

			if (menuOption.equals("1")) {
				for (VirtualPet pet : shelter.getPetsValues()) {
					pet.feedPet();
				}
			}
			if (menuOption.equals("2")) {
				for (VirtualPet pet : shelter.getPetsValues()) {
					pet.waterPet();
				}
			}
			if (menuOption.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				for (VirtualPet pet : shelter.getPetsValues()) {

					System.out.println(pet.getPetName() + " - " + pet.getPetDescription());
				}
				String petName = input.nextLine();
				shelter.getPet(petName).playPet();

			}
			if (menuOption.equals("4")) {

				for (VirtualPet pet : shelter.getPetsValues()) {

					System.out.println(pet.getPetName() + " - " + pet.getPetDescription());
				}
				shelter.petToAdopt();
			}

			if (menuOption.equals("5")) {
				shelter.addNewPet();
			}
			if (menuOption.equals("6")) {
				System.exit(0);
			}
			for (VirtualPet pet : shelter.getPetsValues()) {
				pet.tick();
			}
			// shelter.addNewPet();
			// shelter.addNewPet();
			//
			// System.out.println(shelter.getPetsMap());
			// System.out.println(shelter.getPetsValues());
			// for(VirtualPet pet : shelter.getPetsValues()) {
			// System.out.println(pet.getPetName());
			//
			//
			// }
			// System.out.println("Name for hunger");
			// String inputName = menuOption.nextLine();
			// System.out.println(shelter.getPet(inputName).getHungerLevel());
			// shelter.getPet(inputName).feedPet();
			// System.out.println(shelter.getPet(inputName).getHungerLevel());

		}

	}
}
