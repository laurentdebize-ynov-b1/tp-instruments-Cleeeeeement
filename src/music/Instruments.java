package music;

import java.util.Scanner;

public abstract class Instruments {
	private float price;
	private String model;
	private String brand;
	protected State state;
	
	public Instruments(float price, String model, String brand) {
		this.price = price;
		this.model = model;
		this.brand = brand;
		this.state = State.STOCK;
	}
	
	public Instruments() {
		this.state = State.STOCK;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public State getState() {
		return state;
	}
	
	protected void setState(State state) {
		if (state == State.STOCK) {
			this.state = State.EXHIBITION;
			System.out.println("This instrument is now in exhibtion");
		}else if (state == State.EXHIBITION) {
			this.state = State.STOCK;
			System.out.println("This instrument is now in stock");
		}
	}
	
	public String toString() {
		return "model:" + model + ", brand:" + brand + ", price:" + price + "€, state:" + state;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n\t2. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			}
			
		}while(choice != 2);

	}
	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the specificities of the instrument");
		System.out.print("\nPrice : ");
		this.price = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("\n\nBrand : ");
		this.brand = scanner.nextLine();
		;
		
		System.out.print("\n\nModel : ");
		this.model = scanner.nextLine();
	
		
			
	}

}
