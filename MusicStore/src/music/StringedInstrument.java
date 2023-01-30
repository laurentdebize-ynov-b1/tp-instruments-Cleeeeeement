package music;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public abstract class StringedInstrument extends Instruments implements Tunable {
	private int stringNumber;
	private StringedWood wood;
	private LocalDate tuneDate;
	private LocalTime tuneTime;
	
	public StringedInstrument(float price, String model, String brand,int stringNumber,StringedWood wood) {
		super(price, model, brand);
		this.stringNumber = stringNumber;
		this.tuneDate = java.time.LocalDate.now(); 
		this.tuneTime = java.time.LocalTime.now();
		this.wood = wood;
	}
	
	@Override
	public void tune() {
		tuneDate = java.time.LocalDate.now();
		tuneTime = java.time.LocalTime.now();
		System.out.println("\nL'instrument a bien été accordé le "+ tuneDate+" à "+tuneTime);
		
	}
	
	public StringedWood getWood() {
		return wood;
	}
	
	public int getStringNumber() {
		return stringNumber;
	}
	
	public String toString() {
		return super.toString() + ", string number:" + stringNumber + ", wood:" + wood + ", last tune:" + tuneDate + " at " + tuneTime;
	}
	
	public void editMenu() {
		int choice ;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Tune\n\t3. Leave\n\nchoice : ");
			
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(getState());
				break;
			case 2 :
				tune();
			}
			
		}while(choice != 3);

	}

}
