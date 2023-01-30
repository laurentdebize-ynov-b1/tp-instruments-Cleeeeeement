package music;

import java.util.ArrayList;
import java.util.Scanner;

public class AccousticDrum extends Drum {
	private ArrayList<AccousticPercussion> percussions;
	private String decoration;
	
	public AccousticDrum(float price, String model, String brand,
			Status status,String decoration, ArrayList<AccousticPercussion> percussions) {
		super(price, model, brand, status);
		this.decoration = decoration;
		this.percussions = percussions;
	}
	
	public String getDecoration() {
		return decoration;
	}
	
	public void setDecoration() {
		Scanner scanner = new Scanner(System.in);
		String deco;
		System.out.print("\nWhat decoration you want to put :");
		deco = scanner.nextLine();
		decoration = deco;
		System.out.println("\nThe new decoration is '"+decoration+"'\n");
	}
	
	public String toString(){
		String percussionName = "";
		for (AccousticPercussion percussion : percussions) {
				percussionName += percussion.getClass().getName().substring(6)+",";
		}
		return "Accoustic Drum = "+super.toString() + ", decoration :"+decoration+", percussions:"+percussionName;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		int position;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Change Status\n\t3. Change Decoration\n\tShow percussions\n\t5. Add a percussion\n\t6. Remove a percussion\n\t6. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			case 2 :
				setStatus();
				break;
			case 3 :
				setDecoration();
				break;
			case 4 :
				position = 0;
				for (AccousticPercussion percussion : percussions) {
					position += 1;
					System.out.println("\t"+position + ". " + percussion.toString());
				}
			case 5 :
				break;
			case 6 :
				position = 0;
				for (AccousticPercussion percussion : percussions) {
					position += 1;
					System.out.println("\t"+position + ". " + percussion.toString());
				}
				System.out.println("\nWhich percussion do you want to delete ?\nnumber:");
				choice = scanner.nextInt();
				percussions.remove(choice-1);
				System.out.println("\nThe percussion has been removed\n");
			}
			
		}while(choice != 7);

	}
}
