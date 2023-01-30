package music;

public class BassPad extends ElectronicPercussion {

	public BassPad(float price, String model, String brand, int diameter, PercussionMaterial material) {
		super(price, model, brand, diameter, material);
		// TODO Auto-generated constructor stub
	}
	
	public String demo() {
		return " DOUMMMMMM ";
	}

	public String toString() {
		return "Bass Pad = "+super.toString();
	}
}
