package music;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Piano extends KeyboardInstruments implements Tunable {
	private LocalDate tuneDate;
	private LocalTime tuneTime;
	private int tunningPrice;
	private HammerWood hammerWood;
	public Piano(float price, String model, String brand, int keyNumber, HammerWood hammerWood) {
		super(price, model, brand, keyNumber);
		this.tuneDate = java.time.LocalDate.now(); 
		this.tuneTime = java.time.LocalTime.now();
		this.hammerWood = hammerWood;
	}
	
	public HammerWood getHammerWood() {
		return hammerWood;
	}
	
	public void setHammerWood() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nChoose the wood:");
		System.out.println("\t 1 . Beech");
		System.out.println("\t 2 . Walnut");
		System.out.println("\t 3 . Mahogany");
		System.out.println("\t 4 . Leave");
	
		int Choice ;
		do {
		
			Choice	= scanner.nextInt();
			switch(Choice) {
			 case 1 :
				 hammerWood = HammerWood.BEECH;
				 break;
			 case 2 :
				 hammerWood = HammerWood.WALNUT;
				 break;
			 case 3 :
				 hammerWood = HammerWood.MAHOGANY;
				 break;
			}
		}while(Choice != 4);
		System.out.println("\nThe Hammers are now in "+ hammerWood);
	}

	@Override
	public void tune() {
		Random rand = new Random();
        tunningPrice = rand.nextInt(41) + 10;
        
		tuneDate = java.time.LocalDate.now();
		tuneTime = java.time.LocalTime.now();
		System.out.println("\nL'instrument a bien été accordé le "+ tuneDate+" à "+tuneTime +". The cost is "+ tunningPrice +" €");
	}
	
	public String toString() {
		return "Piano = "+super.toString() + ", hammer wood:" + hammerWood ;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Tune\n\t3. Modify hammer's wood\n\t4. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			case 2 :
				tune();
				break;
			case 3 :
				setHammerWood();
			}
			
		}while(choice != 4);

	}

}
