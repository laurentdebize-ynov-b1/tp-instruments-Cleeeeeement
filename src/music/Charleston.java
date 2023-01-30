package music;

public class Charleston extends AccousticPercussion {

	public Charleston(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public String demo() {
		return " TCHHHICK ";
	}

	public String toString() {
		return "Charleston = "+super.toString();
	}
}
