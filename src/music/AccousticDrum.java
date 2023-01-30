package music;

import java.util.ArrayList;
import java.util.Scanner;

public class AccousticDrum extends Drum {
	private ArrayList<AccousticPercussion> percussions =new ArrayList<>();
	private String decoration;
	
	public AccousticDrum(float price, String model, String brand,
			Status status,String decoration, ArrayList<AccousticPercussion> percussions) {
		super(price, model, brand, status);
		this.decoration = decoration;
		this.percussions = percussions;
	}
	
	public AccousticDrum() {
		
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
	
	public String demo() {
		String demo = "";
		for (AccousticPercussion percussion : percussions) {
			
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
				for (AccousticPercussion percussion : percussions) {
					position += 1;
					System.out.println("\t"+position + ". " + percussion.toString());
				}
			case 5 :
				addPercussion();
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
				break;
			case 7 :
				System.out.println("  ===============  \n"+demo()+"!\n  ===============  ");
			}
			
		}while(choice != 8);

	}
	
	public void initialize(){
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
		System.out.print("\nChoose the percussions you want to add \n\t1. Snare Drum \n\t2. Bass Drum\n\t3. Tom \n\t4. Cymbal\n\t5. Charleston\n\t6. Leave\n\nchoose :");
		choiceBuy = scanner.nextInt();
		switch(choiceBuy) {
		case 1:
			SnareDrum newSnareDrum = new SnareDrum();
			newSnareDrum.initialize();
			percussions.add(newSnareDrum);
			System.out.println("\n\nYou add a "+newSnareDrum.toString());
			break;
		case 2 :
			BassDrum newBassDrum = new BassDrum();
			newBassDrum.initialize();
			percussions.add(newBassDrum);
			System.out.println("\n\nYou add a "+newBassDrum.toString());
			break;
		case 3 :
			Tom newTom = new Tom();
			newTom.initialize();
			percussions.add(newTom);
			System.out.println("\n\nYou add a "+newTom.toString());
			break;
		case 4 :
			Cymbal newCymbal = new Cymbal();
			newCymbal.initialize();
			percussions.add(newCymbal);
			System.out.println("\n\nYou add a "+newCymbal.toString());
			break;
		case 5 :
			Charleston newCharleston = new Charleston();
			newCharleston.initialize();
			percussions.add(newCharleston);
			System.out.println("\n\nYou add a "+newCharleston.toString());
			break;
		}
		}while(choiceBuy != 6);
		
	}
	
	
	
}
