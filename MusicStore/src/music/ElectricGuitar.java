package music;

import java.util.Scanner;

public class ElectricGuitar extends StringedInstrument {
	private String micBrand;
	private Tune tuneChoice;	
	
	public ElectricGuitar(float price, String model, String brand, int stringNumber, StringedWood wood,String micBrand) {
		super(price, model, brand, stringNumber, wood);
		this.tuneChoice = Tune.CLASSIC;
		this.micBrand = micBrand;
	}
	
	public String getMicBrand() {
		return micBrand;
	}
	
	public void setMicBrand(String newMicBrand) {
		this.micBrand = newMicBrand;
	}
	
	public Tune getTune() {
		return tuneChoice;
	}
	
	@Override
	public void tune() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nChoose the tunning :");
		System.out.println("\t 1 . Classic");
		System.out.println("\t 2 . Open G");
		System.out.println("\t 3 . Drop D");
		System.out.println("\t 4 . Leave");
	
		int Choice ;
		do {
		
			Choice	= scanner.nextInt();
			switch(Choice) {
			 case 1 :
				 tuneChoice = Tune.CLASSIC;
				 System.out.println("the new tunning is classic");
				 break;
			 case 2 :
				 tuneChoice = Tune.OPENG;
				 System.out.println("the new tunning is open G");
				 break;
			 case 3 :
				 tuneChoice = Tune.DROPD;
				 System.out.println("the new tunning is rop dclassic");
				 break;
			}
		}while(Choice != 4);
		super.tune();
		System.out.println("This instrument is now tuned in "+ tuneChoice);
	}
	
	public String toString() {
		return "Electric guitar = " + super.toString() + ",\n\t    mic brand:" + micBrand + ", tune:" + tuneChoice;
	}
	
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Tune\n\t3. Change mic\n\t4. Leave\n\nchoice : ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(getState());
				break;
			case 2 :
				tune();
				break;
			case 3 :
				String brandChoice;
				System.out.print("\nNew mic : ");
				scanner.nextLine();
				brandChoice = scanner.nextLine();
				setMicBrand(brandChoice);
				System.out.println("\n\nthe new mic is "+ brandChoice+"\n");	
			}
			
		}while(choice != 4);

	}

}
