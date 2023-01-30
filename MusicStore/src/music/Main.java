package music;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t\t\t   ========================================   \r\n"
				+ "\t\t\t _ _ _       _                          _                  __________\r\n"
				+ "\t\t\t| | | | ___ | | ___  ___  _____  ___   | |_  ___          |          |\r\n"
				+ "\t\t\t| | | || -_|| ||  _|| . ||     || -_|  |  _|| . |         |          |\r\n"
				+ "\t\t\t|_____||___||_||___||___||_|_|_||___|  |_|  |___|         |          |\r\n"
				+ "\t\t\t                                                     ____ |     ____ |\r\n"
				+ "\t\t\t                              _                     /    \\|    /    \\|\r\n"
				+ "\t\t\t _____            _         _| |_    _____         |      |   |      |\r\n"
				+ "\t\t\t|     | _ _  ___ |_| ___   |  __ |  |     | ___     \\____/     \\____/ \r\n"
				+ "\t\t\t| | | || | ||_ -|| ||  _|  |  __ |  |   --|| . |  \r\n"
				+ "\t\t\t|_|_|_||___||___||_||___|  |_   _|  |_____||___|  \r\n"
				+ "\t\t\t                             |_|            \r\n"
				+ "\t\t\t   ========================================   \r\n"
				+ "                                            \r\n"
				+ "                                            \r\n"
				+"Welcome to the best music store in the country (finally I think...)");
		
	Piano piano = new Piano(1200,"ou","eff",87,HammerWood.BEECH);
	ArrangerKeyboard arranger = new ArrangerKeyboard(300,"refef","effef",81,10);
	ElectricGuitar electricGuitar = new ElectricGuitar(600, "Couic","Couac",7,StringedWood.ASH,"Bose");
	Violin violin = new Violin(799, "Keanu", "Reeves",6, StringedWood.CEDAR);
	
	ArrayList<Instruments> instruments = new ArrayList<Instruments>();
	instruments.add(electricGuitar);
	instruments.add(violin);
	instruments.add(piano);
	instruments.add(arranger);
	
	
	int choice;
	System.out.println("\nHello !");
	do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How can I help you ?");
		System.out.println("\n\t 1 . Show all the instruments");
		System.out.println("\t 2 . Sell an instrument ");
		System.out.println("\t 3 . Buy an instrument ");
		System.out.println("\t 4 . How many instruments in the collection ?");
		System.out.println("\t 5 . Modify an instrument");
		System.out.println("\t 6 . Leave the store");
		System.out.print("\nchoose : ");
		choice = scanner.nextInt();
	
		
		switch(choice) {
		case 1 :
			System.out.println("\nInstrument : \n");
			int position = 0;
			for (Instruments instrument : instruments) {
				position += 1;
				System.out.println("\t"+position + ". " + instrument.toString());
			}
			System.out.println("\n");
			break;
		
		case 2 :
			int choiceDelete;
			System.out.print("What is the number of the instrument you want to sell ?\n\nnumber :");
			choiceDelete = scanner.nextInt();
			instruments.remove(choiceDelete-1);
			System.out.println("\nThe instrument has been sold\n");
			break;
		case 4 :
			int stock = 0;
			int exhibition = 0;
			int global = 0;
			
			global = instruments.size();
			for (Instruments instrument : instruments) {
				if (instrument.getState() == State.STOCK) {
					stock += 1;
				}else {
					exhibition +=1;
				}
			}
			System.out.println("\nThe store has a total of "+global+" instrument(s) : \n\n\t"+exhibition+" in exhibition \n\t"+stock+" in stock\n");
			break;
		case 5 :
			int choiceModify;
			
			System.out.print("\nWhich instrument do you want to modify?\n\nnumber : ");
			choiceModify = scanner.nextInt();
			Instruments selectedInstrument = instruments.get(choiceModify-1);
			System.out.println("\n\t===========================================================================  \n\n"+selectedInstrument.toString() +"\n\n\t===========================================================================");
			selectedInstrument.editMenu();
			break;
		case 6 :
			System.out.println("\nGoodbye, see you later !");
			break;
		}
		
		}while(choice != 6);
	
		

	}

}
