package main.java;

public class VirtualPet {

	private int hungerLevel;
	private int thirstLevel;
	private int boredomLevel;
	private String petName;
	private String petDescription;

	public VirtualPet(String petName2, String petDescription2, int hunger, int thirst, int boredom) {
		petName = petName2;
		petDescription = petDescription2;
		hungerLevel = hunger;
		thirstLevel = thirst;
		boredomLevel = boredom;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;

	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getPetDescription() {
		return petDescription;
	}

	public void tick() {
		hungerLevel -= 10;
		thirstLevel -= 10;
		boredomLevel -= 10;
	}

	public void feedPet() {
		hungerLevel += 30;
	}

	public void waterPet() {
		thirstLevel += 30;
	}

	public void playPet() {
		boredomLevel += 30;
	}

}