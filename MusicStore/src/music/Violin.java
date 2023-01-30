package music;

import java.util.Scanner;

public class Violin extends StringedInstrument {
	private BowWood bowWood;
	public Violin(float price, String model, String brand, int stringNumber, StringedWood wood) {
		super(price, model, brand, stringNumber, wood);
		this.bowWood = BowWood.FIBERGLASS;
	}
	
	public BowWood getBowWood() {
		return bowWood;
	}
	
	public void setBowWood() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nChoose the material :");
		System.out.println("\t 1 . Carbon");
		System.out.println("\t 2 . Fibre glass");
		System.out.println("\t 3 . Massaranduba");
		System.out.println("\t 4 . Leave");
	
		int Choice ;
		do {
		
			Choice	= scanner.nextInt();
			switch(Choice) {
			 case 1 :
				 bowWood = BowWood.CARBON;
				 break;
			 case 2 :
				 bowWood = BowWood.FIBERGLASS;
				 break;
			 case 3 :
				 bowWood = BowWood.MASSARANDUBA;
				 break;
			}
		}while(Choice != 4);
		System.out.println("\nThe Bow is now in "+bowWood);
	}
	
	public String toString() {
		return "Viloin = "+super.toString() + ", bow:"+bowWood;
	}
	
	public void editMenu() {
		int choice ;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Tune\n\t3. Change the bow\n\t4. Leave\n\nchoice : ");
			
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(getState());
				break;
			case 2 :
				tune();
				break;
			case 3 :
				setBowWood();
			}
			
		}while(choice != 4);

	}

}
