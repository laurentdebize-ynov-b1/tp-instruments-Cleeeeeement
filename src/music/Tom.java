package music;

public class Tom extends AccousticPercussion {

	public Tom(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public String demo() {
		return " POOM ";
	}

	public String toString() {
		return "Tom = "+super.toString();
	}
}
