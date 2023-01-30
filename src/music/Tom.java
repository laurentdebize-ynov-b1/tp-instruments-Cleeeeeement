package music;

public class Tom extends AccousticPercussion {

	public Tom(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public Tom() {
		
	}
	
	public String demo() {
		return " DCHONGG ";
	}

	public String toString() {
		return "Tom = "+super.toString();
	}
}
