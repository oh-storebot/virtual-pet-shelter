import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldCreateNewPet() {
		VirtualPet pet = new VirtualPet("bob", 100, 100, 100);
	}
	
	@Test
	public void shouldHave100Hunger() {
		VirtualPet pet = new VirtualPet("bob", 100, 100, 100);
		int number = pet.getHungerLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100Boredome() {
		VirtualPet pet = new VirtualPet("bob", 100, 100, 100);
		int number = pet.getBoredomLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100SThirst() {
		VirtualPet pet = new VirtualPet("bob", 100, 100, 100);
		int number = pet.getThirstLevel();
		assertEquals(100, number);
	}
	
	
	
	
	
	
}
