package music;

import java.util.Scanner;

public abstract class Drum extends Instruments{
	private Status status; 

	
	public Drum(float price, String model, String brand,Status status) {
		super(price, model, brand);
		this.status = status ;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus() {
		if (status == Status.ASSEMBLED) {
			status = Status.DISASSEMBLED;
			System.out.println("The Drum is now disassembled");
		}else {
			status = Status.ASSEMBLED;
			System.out.println("The Drum is now assembled");
		}
	}
	
	public String toString() {
		return super.toString()+", status:"+status;
	}
	
	public void editMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice ;
		do {
			System.out.print("\nWhat do you want to edit ?\n\t1. Change State\n2. Change Status\n\t3. Leave\n\nchoice : ");
			
		
			choice = scanner.nextInt();
			switch(choice) {
			case 1 :
				setState(this.state);
				break;
			case 2 :
				setStatus();
			}
			
		}while(choice != 3);

	}
}
