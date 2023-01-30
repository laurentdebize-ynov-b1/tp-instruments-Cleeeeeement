package music;

import java.util.Scanner;

public abstract class KeyboardInstruments extends Instruments {
	private int keyNumber;
	public KeyboardInstruments(float price, String model, String brand , int keyNumber) {
		super(price, model, brand);
		this.keyNumber = keyNumber;
	}
	
	public KeyboardInstruments() {
		
	}
	
	public int getKeyNumber(){
		return keyNumber;
	}
	
	public String toString() {
		return super.toString() + ", number of keys:" + keyNumber;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			}
			
		}while(choice != 2);

	}
	
	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nNumber of keys : ");
		this.keyNumber = scanner.nextInt();
		
		
	}
}
