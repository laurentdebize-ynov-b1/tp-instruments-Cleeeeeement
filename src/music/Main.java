package music;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
		
	Piano piano = new Piano(1200,"95T","eff",87,HammerWood.BEECH);
	ArrangerKeyboard arranger = new ArrangerKeyboard(300,"78I","effef",81,10);
	ElectricGuitar electricGuitar = new ElectricGuitar(600, "Couic","Couac",7,StringedWood.ASH,"Bose");
	Violin violin = new Violin(799, "Keanu", "Reeves",6, StringedWood.CEDAR);
	BassDrum bassDrum = new BassDrum(120, "bomom", "tchachac", 20, PercussionMaterial.WOOD);
	Tom tom = new Tom(120, "Plick", "Plock", 20, PercussionMaterial.METAL);
	AccousticDrum accousticDrum = new AccousticDrum(1100,"Mads","Mikkelsen", Status.ASSEMBLED, "Brand",new ArrayList<AccousticPercussion>(Arrays.asList(tom,bassDrum)));
	
	ArrayList<Instruments> instruments = new ArrayList<Instruments>();
	instruments.add(electricGuitar);
	instruments.add(violin);
	instruments.add(piano);
	instruments.add(arranger);
	instruments.add(accousticDrum);
	
	
	
	int choice;
	System.out.println("\nHello !");
	do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How can I help you ?");
		System.out.println("\n\t 1 . Show all the instruments");
		System.out.println("\t 2 . Buy an instrument ");
		System.out.println("\t 3 . Sell an instrument ");
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
			System.out.print("What is the number of the instrument you want to buy ?\n\nnumber :");
			choiceDelete = scanner.nextInt();
			instruments.remove(choiceDelete-1);
			System.out.println("\nThe instrument has been bought\n");
			break;
		case 3 :
			System.out.print("\nWhat category of instrument do you want to sell ?\n\t1. Stringed instrument\n\t2. Keyboard instrument\n\t3. Percussion Instrument\n\nchoose :");
			int choiceBuy = scanner.nextInt();
			switch(choiceBuy) {
			case 1 :
				System.out.print("\nWhich instrument ?\n\t1. Electric guitar\n\t2. Violin\n\nchoose :");
				choiceBuy = scanner.nextInt();
				switch(choiceBuy) {
				case 1 :
					ElectricGuitar newGuitar = new ElectricGuitar();
					newGuitar.initialize();
					instruments.add(newGuitar);
					System.out.println("\n\nYou sold a "+newGuitar.toString()+"\nfor "+newGuitar.getPrice()+"€\n");
					break;
				case 2 :
					Violin newViolin = new Violin();
					newViolin.initialize();
					instruments.add(newViolin);
					System.out.println("\n\nYou sold a "+newViolin.toString()+"\nfor "+newViolin.getPrice()+"€\n");
					break;

				}
				break;
			case 2 :
				System.out.print("\nWhich instrument ?\n\t1. Arranger KeyBoard\n\t2. Piano\n\nchoose :");
				choiceBuy = scanner.nextInt();
				switch(choiceBuy) {
				case 1 :
					ArrangerKeyboard newarranger = new ArrangerKeyboard();
					newarranger.initialize();
					instruments.add(newarranger);
					System.out.println("\n\nYou sold a "+newarranger.toString()+"\nfor "+newarranger.getPrice()+"€\n");
					break;
				case 2 :
					Piano newPiano = new Piano();
					newPiano.initialize();
					instruments.add(newPiano);
					System.out.println("\n\nYou sold a "+newPiano.toString()+"\nfor "+newPiano.getPrice()+"€\n");
					break;

				}
				break;
			case 3 :{
				System.out.print("\nWhich instrument ?\n\t1. Drum \n\t2. Percussion\n\nchoose :");
				choiceBuy = scanner.nextInt();
				switch(choiceBuy) {
				case 1:
					System.out.print("\nWhat type ?\n\t1. Electronic \n\t2. Accoustic\n\nchoose :");
					choiceBuy = scanner.nextInt();
					switch(choiceBuy) {
					case 1 : 
						ElectronicDrum newElectronicDrum = new ElectronicDrum();
						newElectronicDrum.initialize();
						instruments.add(newElectronicDrum);
						System.out.println("\n\nYou sold a "+newElectronicDrum.toString()+"\nfor "+newElectronicDrum.getPrice()+"€\n");
						break;
					case 2 :
						AccousticDrum newAccousticDrum = new AccousticDrum();
						newAccousticDrum.initialize();
						instruments.add(newAccousticDrum);
						System.out.println("\n\nYou sold a "+newAccousticDrum.toString()+"\nfor "+newAccousticDrum.getPrice()+"€\n");
						break;
					}
					break;
				case 2:
					System.out.print("\nWhat type ?\n\t1. Electronic \n\t2. Accoustic\n\nchoose :");
					choiceBuy = scanner.nextInt();
					switch(choiceBuy) {
					case 1 :
						System.out.print("\nWhich one ?\n\t1. Timpani Pad \n\t2. Bass Pad\n\t3. Tom Pad\n\nchoose :");
						choiceBuy = scanner.nextInt();
						switch(choiceBuy) {
						case 1:
							TimpaniPad newTimpaniPad = new TimpaniPad();
							newTimpaniPad.initialize();
							instruments.add(newTimpaniPad);
							System.out.println("\n\nYou sold a "+newTimpaniPad.toString()+"\nfor "+newTimpaniPad.getPrice()+"€\n");
							break;
						case 2 :
							BassPad newBassPad = new BassPad();
							newBassPad.initialize();
							instruments.add(newBassPad);
							System.out.println("\n\nYou sold a "+newBassPad.toString()+"\nfor "+newBassPad.getPrice()+"€\n");
							break;
						case 3 :
							TomPad newTomPad = new TomPad();
							newTomPad.initialize();
							instruments.add(newTomPad);
							System.out.println("\n\nYou sold a "+newTomPad.toString()+"\nfor "+newTomPad.getPrice()+"€\n");
							break;
						}
						break;
					
					case 2 :
						System.out.print("\nWhich one ?\n\t1. Snare Drum \n\t2. Bass Drum\n\t3. Tom \n\t4. Cymbal\n\t5. Charleston\n\nchoose :");
						choiceBuy = scanner.nextInt();
						switch(choiceBuy) {
						case 1:
							SnareDrum newSnareDrum = new SnareDrum();
							newSnareDrum.initialize();
							instruments.add(newSnareDrum);
							System.out.println("\n\nYou sold a "+newSnareDrum.toString()+"\nfor "+newSnareDrum.getPrice()+"€\n");
							break;
						case 2 :
							BassDrum newBassDrum = new BassDrum();
							newBassDrum.initialize();
							instruments.add(newBassDrum);
							System.out.println("\n\nYou sold a "+newBassDrum.toString()+"\nfor "+newBassDrum.getPrice()+"€\n");
							break;
						case 3 :
							Tom newTom = new Tom();
							newTom.initialize();
							instruments.add(newTom);
							System.out.println("\n\nYou sold a "+newTom.toString()+"\nfor "+newTom.getPrice()+"€\n");
							break;
						case 4 :
							Cymbal newCymbal = new Cymbal();
							newCymbal.initialize();
							instruments.add(newCymbal);
							System.out.println("\n\nYou sold a "+newCymbal.toString()+"\nfor "+newCymbal.getPrice()+"€\n");
							break;
						case 5 :
							Charleston newCharleston = new Charleston();
							newCharleston.initialize();
							instruments.add(newCharleston);
							System.out.println("\n\nYou sold a "+newCharleston.toString()+"\nfor "+newCharleston.getPrice()+"€\n");
							break;
						}
						break;
							
						
					}
				}
			}
			}
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
