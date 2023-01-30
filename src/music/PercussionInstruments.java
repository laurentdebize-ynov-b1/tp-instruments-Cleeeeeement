package music;

import java.util.Scanner;

public abstract class PercussionInstruments extends Instruments{
	private PercussionMaterial  material;
	private int diameter;
	public PercussionInstruments(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand);
		this.material = material;
		this.diameter = diameter;
	}
	
	public PercussionInstruments() {
		
	}
	
	public PercussionMaterial getMaterial() {
		return material;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	
	public String demo() {
		return null;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Play a sound\n\t3. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			case 2 :
				System.out.println(" =======  \n"+demo()+"\n =======  ");
				break;
			
			}
			
		}while(choice != 3);

	}
	
	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		
		super.initialize();
		
		System.out.print("\nDiameter : ");
		this.diameter = scanner.nextInt();
		
		
		int choice ;
		
			System.out.print("\n\nMaterial : \n\t1. METAL\n\t2. WOOD\nchoose : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				material = PercussionMaterial.METAL;
				break;
			case 2 :
				material = PercussionMaterial.WOOD;
				break;
			
			}
			


		
	}
}
