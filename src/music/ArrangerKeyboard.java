package music;

import java.util.Scanner;

public class ArrangerKeyboard extends KeyboardInstruments {
	private int numberOfSound ;
	public ArrangerKeyboard(float price, String model, String brand, int keyNumber, int numberOfSound) {
		super(price, model, brand, keyNumber);
		this.numberOfSound = numberOfSound;
	}
	
	public ArrangerKeyboard() {
		
	}
	
	public int getSoundNumber() {
		return numberOfSound;
	}
	
	public String toString() {
		return "Aranger keyboard = " + super.toString() +", number of sounds:" + numberOfSound;
	}
	
	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nNumber of sounds : ");
		this.numberOfSound = scanner.nextInt();
		
		
	}
	
	
}
