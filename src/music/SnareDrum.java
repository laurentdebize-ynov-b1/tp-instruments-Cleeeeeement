package music;

public class SnareDrum extends AccousticPercussion {

	public SnareDrum(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public String demo() {
		return " POOM ";
	}
	
	public String toString() {
		return "Snare Drum = "+super.toString();
	}
}
