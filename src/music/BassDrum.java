package music;

public class BassDrum extends AccousticPercussion {

	public BassDrum(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public BassDrum() {
		
	}
	
	public String demo() {
		return " POOM ";
	}

	public String toString() {
		return "Bass Drum = "+super.toString();
	}
}
