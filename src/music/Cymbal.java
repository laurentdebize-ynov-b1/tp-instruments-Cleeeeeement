package music;

public class Cymbal extends AccousticPercussion {

	public Cymbal(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public Cymbal() {
		
	}
	
	public String demo() {
		return " CHINNNNNNG ";
	}

	public String toString() {
		return "Cymbal = "+super.toString();
	}
}
