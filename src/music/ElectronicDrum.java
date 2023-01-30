package music;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectronicDrum extends Drum {
	private ArrayList<ElectronicPercussion> percussions = new ArrayList<>();
	private String decoration;
	
	public ElectronicDrum(float price, String model, String brand,
			Status status,String decoration, ArrayList<ElectronicPercussion> percussions) {
		super(price, model, brand, status);
		this.decoration = decoration;
		this.percussions = percussions;
	}
	
	public ElectronicDrum() {
		
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
		for (ElectronicPercussion percussion : percussions) {
				percussionName += percussion.getClass().getName().substring(6)+",";
		}
		return "Accoustic Drum = "+super.toString() + ", decoration :"+decoration+", percussions:"+percussionName;
	}
	
	public String demo() {
		String demo = "";
		for (ElectronicPercussion percussion : percussions) {
			
			demo += percussion.demo();
		}
		return demo;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		int position;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Change Status\n\t3. Change Decoration\n\t4. Show percussions\n\t5. Add a percussion\n\t6. Remove a percussion\n\t7. Play a sound\n\t8. Leave\n\nchoice : ");
			
		
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
				for (ElectronicPercussion percussion : percussions) {
					position += 1;
					System.out.println("\t"+position + ". " + percussion.toString());
				}
			case 5 :
				addPercussion();
				break;
			case 6 :
				position = 0;
				for (ElectronicPercussion percussion : percussions) {
					position += 1;
					System.out.println("\t"+position + ". " + percussion.toString());
				}
				System.out.println("\nWhich percussion do you want to delete ?\nnumber:");
				choice = scanner.nextInt();
				percussions.remove(choice-1);
				System.out.println("\nThe percussion has been removed\n");
				break;
			case 7 :
				System.out.println("  ===============  \n"+demo()+"!\n  ===============  ");
			}
			
		}while(choice != 8);

	}
	
	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		super.initialize();
		scanner.nextLine();
		System.out.print("\nDecoration : ");
		this.decoration = scanner.nextLine();
		addPercussion();
	}
	
	public void addPercussion() {
		Scanner scanner = new Scanner(System.in);
		int choiceBuy;
		do {
			System.out.print("\nChoose the percussions you want to add\n\t1. Timpani Pad \n\t2. Bass Pad\n\t3. Tom Pad\n\t4. Leave\n\nchoose :");
			choiceBuy = scanner.nextInt();
			switch(choiceBuy) {
			case 1:
				TimpaniPad newTimpaniPad = new TimpaniPad();
				newTimpaniPad.initialize();
				percussions.add(newTimpaniPad);
				System.out.println("\n\nYou add a "+newTimpaniPad.toString());
				break;
			case 2 :
				BassPad newBassPad = new BassPad();
				newBassPad.initialize();
				percussions.add(newBassPad);
				System.out.println("\n\nYou add a "+newBassPad.toString());
				break;
			case 3 :
				TomPad newTomPad = new TomPad();
				newTomPad.initialize();
				percussions.add(newTomPad);
				System.out.println("\n\nYou add a "+newTomPad.toString());
				break;
			}
			
		}while(choiceBuy != 4);
	}
}
